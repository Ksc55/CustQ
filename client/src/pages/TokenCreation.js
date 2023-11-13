import React from "react";

const TokenCreation = () => {
  return (
    <div className="flex flex-col items-center justify-center my-48 font-montserrat">
      <h1 className="text-3xl font-bold">Token Creation Success</h1>
      <h2 className="text-2xl py-4">Do you want to Create Token</h2>
      <div className="flex flex-row py-32 gap-8">
        <button className="bg-[#2E43FF] rounded-2xl text-[#fff] py-3 px-6 my-8 ">
          Yes, Create Token
        </button>
        <button className="bg-[#AEAEAE] rounded-2xl py-3 px-6 my-8 ">
          No, Go Back
        </button>
      </div>
    </div>
  );
};

export default TokenCreation;
