import React, { useState } from "react";
import Header from "../components/Header";

const Otpverify = () => {
  const [otp, setOtp] = useState(new Array(6).fill(""));

  const handleChange = (e, index) => {
    if (isNaN(e.target.value)) return false;
    const newOtp = [...otp];
    newOtp[index] = e.target.value;
    setOtp(newOtp);

    const nextInput = e.target.nextSibling;
    if (nextInput) {
      nextInput.focus();
    }
  };

  const handleConfirmSignup = () => {
    const otpString = otp.join("");
    fetch("/api/verifyOTP", {
      method: "POST",
      body: JSON.stringify({ otp: otpString }),
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((response) => {
        if (response.ok) {
          alert("OTP is valid");
        } else {
          alert("Invalid OTP");
        }
      })
      .catch((error) => {
        console.error("Error:", error);
      });
  };

  return (
    <>
      <Header />
      <div className="w-[800px] flex flex-col rounded-2xl m-auto bg-[#F5F5F5] mt-8 px-16 py-12">
        <h1 className="text-3xl text-center font-bold">Enter OTP</h1>
        <img
          src="/images/otpverify.svg"
          alt="otpverify-svg"
          className="m-auto my-8"
        ></img>
        <p className="text-2xl text-center">
          Enter the OTP sent to your email address.
        </p>
        <div className="flex flex-row gap-4 items-center text-2xl m-auto my-6">
          {otp.map((data, index) => {
            return (
              <input
                type="text"
                className="w-[64px] h-[64px] items-center px-4 rounded-2xl bg-[#DFDFDF]"
                name="otp"
                maxLength="1"
                key={index}
                value={data}
                onChange={(e) => handleChange(e, index)}
                onFocus={(e) => e.target.select()}
              />
            );
          })}
        </div>
        <button
          className="bg-[#AEAEAE] rounded-2xl p-3 max-w-fit m-auto my-4"
          onClick={handleConfirmSignup}
        >
          Confirm Signup
        </button>
      </div>
    </>
  );
};

export default Otpverify;
