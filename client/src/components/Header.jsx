import React from "react";
import { useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link";

const Header = () => {
  const location = useLocation();

  const isLoginPage = location.pathname === "/login";

  const buttonText = isLoginPage ? "Signup" : "Login";

  return (
    <div className="bg-[#dfdacc] w-full flex flex-row items-center justify-between py-2 px-24">
      <div className="rounded-full bg-[#BEC5FF] p-4">Raja</div>
      <HashLink smooth to={isLoginPage ? "/signup" : "/login"}>
        <button className="rounded-2xl bg-[#BEC5FF] py-2 px-6">
          {buttonText}
        </button>
      </HashLink>
    </div>
  );
};

export default Header;
