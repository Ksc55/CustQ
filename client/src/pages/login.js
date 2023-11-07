import React, { useState } from "react";
import Header from "../components/Header";

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState(null);

  const handleLogin = async () => {
    try {
      const response = await fetch("/api/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ email, password }),
      });

      if (response.ok) {
        console.log("Login successful");
      } else {
        setError("Invalid email or password. Please try again.");
      }
    } catch (error) {
      setError("An error occurred while logging in.");
      console.error("Error:", error);
    }
  };

  return (
    <>
      <Header />
      <div className="w-[800px] flex flex-col rounded-2xl m-auto bg-[#F5F5F5] mt-8 px-28 py-20">
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
              autoFocus
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              className="px-4 py-2 my-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
              required
            />
          </div>
          <div className="flex flex-col my-1">
            <label htmlFor="name" className="font-semibold">
              Password
            </label>
            <input
              type="password"
              id="password"
              placeholder="Enter your password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              className="px-4 py-2 my-2 transition duration-300 border rounded focus:border-none focus:outline-none focus:ring-1 focus:ring-[black]"
              required
            />
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
