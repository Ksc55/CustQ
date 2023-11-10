import React, { useState } from "react";
import { NavLink } from "react-router-dom";

const Navbar = () => {
  const [menuOpen, setMenuOpen] = useState(false);

  const toggleMenu = () => {
    setMenuOpen(!menuOpen);
  };

  return (
    <header className="bg-[#F5F5F5] w-full font-montserrat">
      <nav className="flex justify-between items-center mx-auto px-6 py-2 md:px-6">
        <div className="flex items-center ml-12">
          <NavLink to="/">
            <img
              className="w-11 cursor-pointer"
              src="/images/CustQ-Logo.svg"
              alt="Logo"
            />
          </NavLink>
        </div>
        <ul
          className={`md:flex md:items-center hidden space-x-3 text-xl ${
            menuOpen ? "block" : "hidden"
          }`}
        >
          <NavLink to="/">
            <li className="px-3">Home</li>
          </NavLink>
          <NavLink to="/">
            <li className="px-3">Services</li>
          </NavLink>
          <NavLink to="/">
            <li className="px-3">Contact us</li>
          </NavLink>
          <NavLink to="/">
            <li className="px-3">Blog</li>
          </NavLink>
        </ul>
        <div className="md:flex md:items-center hidden mr-8">
          <NavLink to="/login">
            <button className="bg-[#9FA9FF] max-w-fit text-[#fff] py-2 px-6 rounded-md my-2 mx-2">
              Login
            </button>
          </NavLink>
        </div>
        {/* Sidebar Hamburger Menu */}
        <div className="md:hidden">
          <button
            onClick={toggleMenu}
            className="p-2 rounded-md  focus:outline-none focus:bg-gray-200"
          >
            {menuOpen ? (
              <i className="fas fa-times hidden" />
            ) : (
              <i className="fas fa-bars text-xl" />
            )}
          </button>
        </div>
        {/* Sidebar Menu */}
        <div
          className={`fixed md:hidden top-0 right-0 h-full w-56 bg-[#FFFAE9] bg-opacity-70 shadow-lg z-20 transform ease-in-out duration-300 ${
            menuOpen ? "translate-x-0" : "translate-x-full"
          } md:translate-x-0`}
        >
          <div className="p-4 flex items-center justify-center">
            <ul className="space-y-4 mt-12">
              <NavLink to="/">
                <li className="text-gray-800 text-xl  p-2">Home</li>
              </NavLink>
              <NavLink to="/">
                <li className="text-gray-800 text-xl  p-2">Services</li>
              </NavLink>
              <NavLink to="/">
                <li className="text-gray-800 text-xl  p-2">Contact Us</li>
              </NavLink>
              <NavLink to="/">
                <li className="text-gray-800 text-xl  p-2">Blog</li>
              </NavLink>

              <NavLink to="/login">
                <li>
                  <button className="bg-[#959eee] max-w-fit text-[#fff] py-2 px-6 rounded-md my-2 mx-2">
                    Login
                  </button>
                </li>
              </NavLink>
            </ul>
            {/* Close (X) icon inside the Sidebar Menu */}
            <button
              onClick={toggleMenu}
              className="absolute top-4 right-4 p-2 rounded-md  focus:outline-none focus:bg-gray-200"
            >
              <i className="fas fa-times text-2xl" />
            </button>
          </div>
        </div>
      </nav>
    </header>
  );
};

export default Navbar;
