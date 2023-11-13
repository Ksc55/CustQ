import React from "react";
import { NavLink } from "react-router-dom";
import { HashLink } from "react-router-hash-link";

const Sidebar = () => {
  return (
    <div className="flex flex-col relative items-center justify-center w-1/12 h-[96vh] bg-[#fff] font-montserrat">
      <div className="absolute top-8">
        <NavLink to="/" className="py-4">
          <img
            className="w-12 cursor-pointer"
            src="/images/CustQ-Logo.svg"
            alt="Logo"
          />
        </NavLink>
      </div>
      <div className="flex flex-col items-center justify-center my-12">
        <HashLink to="/dashboard" className="py-4">
          <img
            className="w-10 cursor-pointer"
            src="/images/dashboard.svg"
            alt="Logo"
          />
        </HashLink>
        <HashLink to="/tokensettings" className="py-4">
          <img
            className="w-20 cursor-pointer"
            src="/images/settings.svg"
            alt="Logo"
          />
        </HashLink>
        <HashLink to="/reports" className="py-4">
          <img
            className="w-20 cursor-pointer"
            src="/images/report.svg"
            alt="Logo"
          />
        </HashLink>
      </div>
      <div className="absolute bottom-4">
        <HashLink to="/login" className="py-4">
          <img
            className="w-20 cursor-pointer"
            src="/images/logout.svg"
            alt="Logo"
          />
        </HashLink>
      </div>
    </div>
  );
};

export default Sidebar;
