import React from "react";
import { NavLink, useLocation } from "react-router-dom";
import { HashLink } from "react-router-hash-link";

const Sidebar = () => {
  const location = useLocation();

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
        <HashLink
          to="/dashboard"
          className={`my-4 ${
            location.pathname === "/dashboard" ? "active" : ""
          }`}
        >
          <img
            className="w-8 cursor-pointer hover:bg-[#7381FF] text-[#2E43FF]"
            src="/images/dashboard.svg"
            alt="Logo"
          />
        </HashLink>
        <HashLink
          to="/tokensettings"
          className={`my-4 ${
            location.pathname === "/tokensettings" ? "active" : ""
          }`}
        >
          <img
            className="w-12 cursor-pointer hover:bg-[#7381FF]  text-[#2E43FF]"
            src="/images/settings.svg"
            alt="Logo"
          />
        </HashLink>
        <HashLink
          to="/reports"
          className={`my-4 ${location.pathname === "/reports" ? "active" : ""}`}
        >
          <img
            className="w-12 cursor-pointer hover:bg-[#7381FF] hover:text-[#2E43FF]"
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
