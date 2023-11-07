import React from "react";

const DeleteConfirm = () => {
  return (
    <div className="flex flex-col items-center justify-center my-48">
      <h1 className="text-3xl font-bold">Delete Confirmation</h1>
      <h2 className="text-2xl py-4">Do you want to Delete Queue Name ?</h2>
      <div className="flex flex-row py-32 gap-8">
        <button className="bg-[#2E43FF] rounded-2xl text-[#fff] py-3 px-6 my-8 ">
          Yes, Delete Token
        </button>
        <button className="bg-[#AEAEAE] rounded-2xl py-3 px-6 my-8 ">
          No, Go Back
        </button>
      </div>
    </div>
  );
};

export default DeleteConfirm;
