import React from "react";

const Error404 = () => {
  return (
    <div className="flex flex-col items-center justify-center py-32 px-28">
      <h1 className="text-3xl font-bold">Data Not Found</h1>
      <img
        src="/images/errorscreen.svg"
        alt="error404"
        className="m-auto my-8"
      />
      <p className="text-2xl text-center">
        Here Seems Empty. Start By
        <span className="font-bold"> Creating Token</span>
      </p>
      <button className="bg-[#2E43FF] rounded-2xl text-[#fff] py-3 px-6 my-8 ">
        Create New Token
      </button>
    </div>
  );
};

export default Error404;
