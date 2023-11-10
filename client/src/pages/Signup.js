import React, { useState } from "react";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import Header from "../components/Header";

const Signup = () => {
  const [name, setName] = useState("");
  const [mobile, setMobile] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [reenterPassword, setReenterPassword] = useState("");
  const [errors, setErrors] = useState({
    name: "",
    mobile: "",
    email: "",
    password: "",
    reenterPassword: "",
  });

  const handleNameChange = (e) => {
    setName(e.target.value);
  };

  const handleMobileChange = (e) => {
    setMobile(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleReenterPasswordChange = (e) => {
    setReenterPassword(e.target.value);
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    let hasError = false;
    const updatedErrors = {};

    if (name.trim() === "") {
      updatedErrors.name = "Name is required";
      hasError = true;
    }

    if (mobile.trim() === "") {
      updatedErrors.mobile = "Mobile number is required";
      hasError = true;
    }

    if (email.trim() === "") {
      updatedErrors.email = "Email is required";
      hasError = true;
    }

    if (password.trim() === "") {
      updatedErrors.password = "Password is required";
      hasError = true;
    }

    if (password !== reenterPassword) {
      updatedErrors.reenterPassword = "Passwords do not match";
      hasError = true;
    }

    if (hasError) {
      setErrors(updatedErrors);
    } else {
      setErrors({
        name: "",
        mobile: "",
        email: "",
        password: "",
        reenterPassword: "",
      });

      const formData = {
        name,
        mobile,
        email,
        password,
      };

      try {
        const response = await fetch("YOUR_BACKEND_API_ENDPOINT", {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify(formData),
        });

        if (response.ok) {
          console.log("Form data sent to the backend successfully");
          toast.success("🙏 Thank You, Our Team will contact you soon.", {
            position: "top-right",
            autoClose: 5000,
            hideProgressBar: false,
            closeOnClick: true,
            pauseOnHover: true,
            draggable: true,
            progress: undefined,
            theme: "light",
          });
        } else {
          console.error("Failed to send form data to the backend");
          toast.error("Error while sending the form data. Please try again.", {
            position: "top-right",
            autoClose: 5000,
            hideProgressBar: false,
            closeOnClick: true,
            pauseOnHover: true,
            draggable: true,
            progress: undefined,
            theme: "light",
          });
        }
      } catch (error) {
        console.error("Error while sending form data to the backend", error);
        toast.error("Error while sending the form data. Please try again.", {
          position: "top-right",
          autoClose: 5000,
          hideProgressBar: false,
          closeOnClick: true,
          pauseOnHover: true,
          draggable: true,
          progress: undefined,
          theme: "light",
        });
      }

      setName("");
      setMobile("");
      setEmail("");
      setPassword("");
      setReenterPassword("");
    }
  };

  return (
    <>
      <Header />
      <div className="py-4  h-[110vh] ">
        <div className="w-[750px] bg-[#F5F5F5] text-base mx-auto mt-8 py-8 px-20 rounded-xl">
          <h1 className="text-4xl text-center">Sign Up</h1>
          <form className="flex flex-col m-2">
            <div className="flex flex-col m-2">
              <label htmlFor="name" className="font-semibold">
                Name
              </label>
              <input
                type="text"
                id="name"
                value={name}
                placeholder="Enter your name"
                onChange={handleNameChange}
                autoFocus
                className="px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                required
              />
              {errors.name && (
                <span className="text-[#e16b35]">{errors.name}</span>
              )}
            </div>
            <div className="flex flex-col m-2">
              <label htmlFor="email" className="text-sm font-semibold">
                Email address
              </label>
              <input
                type="email"
                id="email"
                value={email}
                placeholder="Enter your email address"
                onChange={handleEmailChange}
                className="px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                required
              />
              {errors.email && (
                <span className="text-[#e16b35]">{errors.email}</span>
              )}
            </div>
            <div className="flex flex-col m-2">
              <label htmlFor="mobile" className="block mb-2">
                Mobile Number
              </label>
              <input
                type="text"
                id="mobileNumber"
                className="px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                placeholder="Enter mobile number"
                value={mobile}
                onChange={handleMobileChange}
                required
              />
              {errors.mobile && (
                <span className="text-[#e16b35]">{errors.mobile}</span>
              )}
            </div>
            <div className="flex flex-col m-2">
              <label htmlFor="password" className="block mb-2">
                Password
              </label>
              <input
                type="password"
                id="password"
                value={password}
                placeholder="Enter your password"
                autocomplete="current-password"
                onChange={handlePasswordChange}
                className="px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                required
              />
              {errors.password && (
                <span className="text-[#e16b35]">{errors.password}</span>
              )}
            </div>
            <div className="flex flex-col m-2">
              <label htmlFor="reenterPassword" className="block mb-2">
                Re-enter Password
              </label>
              <input
                type="password"
                id="reenterPassword"
                value={reenterPassword}
                placeholder="Re-enter your password"
                onChange={handleReenterPasswordChange}
                className="px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                required
              />
              {errors.reenterPassword && (
                <span className="text-[#e16b35]">{errors.reenterPassword}</span>
              )}
            </div>
            <div className="flex justify-center items-center">
              <button
                type="submit"
                onClick={handleSubmit}
                className="max-w-fit mx-auto px-4 py-2 text-lg mt-4 font-semibold bg-[#AEAEAE] rounded-md "
              >
                Submit
              </button>
            </div>
          </form>
        </div>
      </div>
    </>
  );
};

export default Signup;
