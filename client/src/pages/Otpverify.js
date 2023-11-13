import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import { useCookies } from "react-cookie";
import { useNavigate } from "react-router-dom";
import Header from "../components/Header";
import axios from "axios";

const Otpverify = () => {
  const { id, email } = useParams();
  const navigate = useNavigate();
  const [otp, setOtp] = useState(new Array(6).fill(""));
  const [cookies] = useCookies(); // Retrieve cookies

  useEffect(() => {
    // Check if cookies are available, and perform any necessary actions
    if (!cookies.cachedEmail || !cookies.cachedRegisterID) {
      // Handle the case where cookies are not available
      console.error("Cookies are missing. Redirect or handle accordingly.");
    }
  }, [cookies]);

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

    const requestData = {
      // registerID: cookies.cachedRegisterID || id,
      email: cookies.cachedEmail || email,
      otp: otpString,
    };

    axios
      .post(
        `http://localhost:8080/registration/emailValidation?registerID=${id}`,
        requestData,
        {
          headers: {
            "Content-Type": "application/json",
          },
        }
      )
      .then((response) => {
        if (response.status === 200) {
          console.log("OTP is valid");
          navigate("/dashboard");
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
      <div className="w-[800px] font-montserrat flex flex-col rounded-2xl m-auto bg-[#F5F5F5] mt-8 px-16 py-12">
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
