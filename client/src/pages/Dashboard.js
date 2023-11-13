import React from "react";
import Sidebar from "../components/Sidebar";

const Dashboard = () => {
  return (
    <div className="flex flex-row ">
      <Sidebar />
      <div className="w-full flex items-center justify-center bg-[#DFDFDF]">
        <h1 className="font-montserrat font-bold text-3xl text-center">
          This is a dashboard page
        </h1>
      </div>
    </div>
  );
};

export default Dashboard;
