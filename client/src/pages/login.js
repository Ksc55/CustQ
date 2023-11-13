import React, { useState } from "react";
import Header from "../components/Header";
import { Eye, EyeOff } from "lucide-react";
import axios from "axios";

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [passwordType, setPasswordType] = useState("password");
  const [error, setError] = useState(null);

  const handleLogin = async () => {
    try {
      const response = await axios.post("/api/login", {
        email,
        password,
      });

      if (response.status === 200) {
        console.log("Login successful");
      } else {
        setError("Invalid email or password. Please try again.");
      }
    } catch (error) {
      setError("An error occurred while logging in.");
      console.error("Error:", error);
    }
  };

  const handleClick = () => {
    setPasswordType((prevType) =>
      prevType === "password" ? "text" : "password"
    );
  };

  return (
    <>
      <Header />
      <div className="w-[800px] flex flex-col font-montserrat select-none rounded-2xl m-auto bg-[#F5F5F5] mt-8 px-28 py-20">
        <h1 className="text-3xl text-center font-bold">Login</h1>
        <form className="flex flex-col m-2">
          <div className="flex flex-col">
            <label htmlFor="email" className="text-sm font-semibold">
              Email address
            </label>
            <input
              type="email"
              id="email"
              placeholder="Enter your email address"
              autoComplete="email" 
              autoFocus
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              className="px-4 py-2 my-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
              required
            />
          </div>
          <div className="flex flex-col my-1 relative">
            <label htmlFor="password" className="font-semibold">
              Password
            </label>
            <div className="relative">
              <input
                type={passwordType}
                id="password"
                placeholder="Enter your password"
                autoComplete="current-password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                className="w-full px-4 py-2 my-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
                required
              />
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
        </form>
        {error && <div className="text-red-600">{error}</div>}
        <button
          onClick={handleLogin}
          className="bg-[#AEAEAE] rounded-2xl py-2 px-12 max-w-fit m-auto my-4"
        >
          Login
        </button>
      </div>
    </>
  );
};

export default Login;
