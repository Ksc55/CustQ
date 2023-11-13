import React from "react";
import { useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link";
import { NavLink } from "react-router-dom";

const Header = () => {
  const location = useLocation();

  const isLoginPage = location.pathname === "/login";

  const buttonText = isLoginPage ? "Signup" : "Login";

  return (
    <div className="bg-[#F5F5F5] font-montserrat w-full flex flex-row items-center justify-between py-2 px-24">
      <div className="flex items-center ml-12">
        <NavLink to="/">
          <img
            className="w-11 cursor-pointer"
            src="/images/CustQ-Logo.svg"
            alt="Logo"
          />
        </NavLink>
      </div>
      <HashLink smooth to={isLoginPage ? "/signup" : "/login"}>
        <button className="rounded-2xl bg-[#BEC5FF] py-2 px-6">
          {buttonText}
        </button>
      </HashLink>
    </div>
  );
};

export default Header;
