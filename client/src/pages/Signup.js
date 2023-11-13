import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useCookies } from "react-cookie";
import Header from "../components/Header";
import { Eye, EyeOff } from "lucide-react";
import axios from "axios";

const Signup = () => {
  const navigate = useNavigate();
  const [cookies, setCookie] = useCookies();
  const [name, setName] = useState("");
  const [mobile, setMobile] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [reenterPassword, setReenterPassword] = useState("");
  const [passwordType, setPasswordType] = useState("password");
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
    const enteredMobile = e.target.value;
    setMobile(enteredMobile);

    const mobileRegex = /^\d{10}$/;

    if (!mobileRegex.test(enteredMobile)) {
      setErrors((prevErrors) => ({
        ...prevErrors,
        mobile: "Mobile number must be 10 digits",
      }));
    } else {
      setErrors((prevErrors) => ({
        ...prevErrors,
        mobile: "",
      }));
    }
  };

  const handleEmailChange = (e) => {
    const enteredEmail = e.target.value;
    setEmail(enteredEmail);

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailRegex.test(enteredEmail)) {
      setErrors((prevErrors) => ({
        ...prevErrors,
        email: "Enter a valid email address",
      }));
    } else {
      setErrors((prevErrors) => ({
        ...prevErrors,
        email: "",
      }));
    }
  };

  const handlePasswordChange = (e) => {
    const enteredPassword = e.target.value;
    setPassword(enteredPassword);

    const passwordRegex = /^(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*[0-9]).{8,}$/;

    if (!passwordRegex.test(enteredPassword)) {
      setErrors((prevErrors) => ({
        ...prevErrors,
        password: "Password must have 8 characters like Aabb@1234",
      }));
    } else {
      setErrors((prevErrors) => ({
        ...prevErrors,
        password: "",
      }));
    }
  };

  const handleReenterPasswordChange = (e) => {
    setReenterPassword(e.target.value);
  };

  const handleClick = () => {
    setPasswordType((prevType) =>
      prevType === "password" ? "text" : "password"
    );
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    let hasError = false;
    const updatedErrors = {};

    if (password !== reenterPassword) {
      hasError = true;
      updatedErrors.reenterPassword = "Passwords do not match";
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
        const response = await axios.post(
          "http://localhost:8080/registration/registerOrganization",
          formData,
          {
            headers: {
              "Content-Type": "application/json",
            },
          }
        );

        if (response.status === 200) {
          const { id } = response.data;

          // Set cookies for the user
          console.log(cookies);
          setCookie("cachedEmail", email, {
            expires: new Date(Date.now() + 86400 * 1000),
          });
          setCookie("cachedRegisterID", id, {
            expires: new Date(Date.now() + 86400 * 1000),
          });
          navigate(`/otpverify/${id}`);
        } else {
          console.error("Error during signup:", response);
        }
      } catch (error) {
        console.error("Error during signup:", error);
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
      <div className="py-4 h-[110vh] font-montserrat select-none ">
        <div className="w-[750px] bg-[#F5F5F5] text-base mx-auto mt-8 py-8 px-20 rounded-xl">
          <h1 className="text-4xl text-center">Sign Up</h1>
          <form className="flex flex-col m-2" onSubmit={handleSubmit}>
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
                type="number"
                id="mobile"
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
            <div className="flex flex-col m-2 relative">
              <label htmlFor="password" className="block mb-2">
                Password
              </label>
              <div className="relative">
                <input
                  type={passwordType}
                  id="password"
                  value={password}
                  placeholder="Enter your password"
                  autoComplete="current-password"
                  onChange={handlePasswordChange}
                  className="w-full px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                  required
                />
                {errors.password && (
                  <p className="text-[#e16b35] absolute left-0 ">
                    {errors.password}
                  </p>
                )}
                <div
                  className="absolute right-0 top-1/2 transform -translate-y-1/2 cursor-pointer"
                  onClick={handleClick}
                >
                  {passwordType === "password" ? (
                    <Eye className="text-[#718096] hover:text-[#2d3748]" />
                  ) : (
                    <EyeOff className="text-[#718096] hover:text-[#2d3748]" />
                  )}
                </div>
              </div>
            </div>
            <div className="flex flex-col m-2 relative">
              <label htmlFor="reenterPassword" className="block mb-2">
                Re-enter Password
              </label>
              <div className="relative">
                <input
                  type="password"
                  id="reenterPassword"
                  value={reenterPassword}
                  placeholder="Re-enter your password"
                  onChange={handleReenterPasswordChange}
                  className="w-full px-4 py-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                  required
                />
                {errors.reenterPassword && (
                  <p className="text-[#e16b35] absolute left-0 mt-1">
                    {errors.reenterPassword}
                  </p>
                )}
              </div>
            </div>
            <div className="flex justify-center items-center">
              <button
                type="submit"
                onClick={handleSubmit}
                className="max-w-fit mx-auto px-4 py-2 text-lg mt-4 font-semibold bg-[#AEAEAE] rounded-md"
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
