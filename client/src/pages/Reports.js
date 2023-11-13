import React from "react";
import Sidebar from "../components/Sidebar";

const Reports = () => {
  return (
    <div className="flex flex-row ">
      <Sidebar />
      <div className="w-full h-[100vh] flex items-center justify-center bg-[#DFDFDF]">
        <h1 className="font-montserrat font-bold text-3xl text-center">
          This is a Reports page
        </h1>
      </div>
    </div>
  );
};

export default Reports;
