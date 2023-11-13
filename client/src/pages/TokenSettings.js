import React from "react";
import Sidebar from "../components/Sidebar";

const TokenSettings = () => {
  return (
    <div className="flex flex-row ">
      <Sidebar />
      <div className="w-full flex flex-col items-center justify-center bg-[#DFDFDF] font-montserrat">
        <div className="w-full h-[16vh]px-20 py-2 flex flex-row items-center  bg-[#fff] justify-between">
          <p className="font-montserrat font-bold text-xl text-center ml-10">
            Create Queue
          </p>
          <button className="rounded-2xl bg-[#BEC5FF] py-2 px-6 mr-20">
            Raja
          </button>
        </div>

        <div className=" py-4 w-[850px] h-[87vh]  bg-gray-100  border-2 rounded-md mx-auto my-6">
          <h1 className="text-center text-2xl">Add Queue Information</h1>
          <form className="px-24">
            <div className="mt-3 flex flex-col">
              <label htmlFor="queue-name">Queue Name</label>
              <input
                type="text"
                id="queue-name"
                className="mt-3 py-3 px-1 border bg-gray-200 rounded-md"
                placeholder="Enter Queue Name e.g Laboratory 1"
              />
            </div>
            <div className="flex flex-row my-3 gap-8 p-2">
              <div className="flex flex-col ">
                <label htmlFor="queue-group">Queue Group</label>
                <select
                  id="queue-grp"
                  className=" py-3 w-[300px] px-6 border-2  border-[#a2a1a1] rounded-2xl my-2 "
                >
                  <option value="Select Queue group" className="text-2xl">
                    Select Queue Group
                  </option>
                  <option value="Lab Test" className="text-2xl">
                    Lab Test
                  </option>
                </select>
              </div>
              <div className="flex flex-col">
                <label htmlFor="queue-sub-group">Queue Sub-group</label>
                <select
                  id="queue-sub-grp"
                  className="py-3 px-6 w-[300px] border-2  border-[#a2a1a1] rounded-2xl my-2 "
                >
                  <option value="Select Queue Sub group">
                    Select Queue Sub Group
                  </option>
                  <option value="HPVP">HPVP</option>
                  <option value="HABP">HABP</option>
                </select>
              </div>
            </div>

            <div className="flex my-3 gap-8 p-2">
              <div className="flex flex-col">
                <label htmlFor="queue-start-time">Queue Start Time :</label>
                <div className="flex w-[300px]">
                  <input
                    type="date"
                    id="queue-start-time"
                    className="mt-4 py-3 border-2  border-[#a2a1a1] rounded-2xl px-2 "
                    placeholder="Start Date"
                  />
                  <input
                    type="time"
                    className="mt-4 ml-2 py-3 border-2 rounded-2xl px-2  border-[#a2a1a1]"
                    placeholder="Start Date"
                  />
                </div>
              </div>
              <div className="flex flex-col">
                <label htmlFor="queue-end-time">Queue End Time :</label>
                <div className="flex w-[300px]">
                  <input
                    type="date"
                    id="queue-start-time"
                    className="mt-4 py-3 border-2  border-[#a2a1a1] rounded-2xl px-2 "
                    placeholder="Start Date"
                  />
                  <input
                    type="time"
                    className="mt-4 ml-2 py-3 border-2 rounded-2xl px-2  border-[#a2a1a1]"
                    placeholder="Start Date"
                  />
                </div>
              </div>
            </div>

            <div className="flex my-3 gap-8 p-2">
              <div className="flex flex-col">
                <label htmlFor="queue-frequency">Queue Frequency :</label>
                <select
                  id="queue-frequency"
                  className="w-[300px] border-2 border-[#a2a1a1] py-3 px-6  rounded-2xl my-2"
                >
                  <option value="select queue frequency">
                    Select Queue Frequency
                  </option>
                </select>
              </div>
              <div className="flex flex-col ">
                <label htmlFor="max-token">Maximum Token No :</label>
                <input
                  type="text"
                  id="max-token"
                  className="py-3 px-4 w-[300px] border-2  border-[#a2a1a1] rounded-lg my-2"
                  placeholder="Enter Maximum Token Number"
                />
              </div>
            </div>

            <div className="flex gap-8 p-2">
              <div className="flex flex-col">
                <label htmlFor="token-type">Token Type :</label>
                <select
                  id="token-type"
                  className="w-[250px] border-2 border-[#a2a1a1] py-3 px-6  rounded-2xl my-2"
                >
                  <option value="token-type">Token type</option>
                  <option value="virat-kohli">Alphanumerical</option>
                </select>
              </div>
              <div className="flex flex-col ">
                <label htmlFor="token-reset">Token Reset :</label>
                <select
                  id="token-reset"
                  className="w-[250px] border-2 border-[#a2a1a1] py-3 px-6 rounded-2xl my-2"
                >
                  <option value="Select Reset Period">
                    Select Reset Period
                  </option>
                </select>
              </div>
            </div>

            <div className="flex items-center justify-center mx-auto ">
              <button className="rounded-2xl bg-[#BEC5FF] py-2 px-6 ">
                Create Queue
              </button>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
};

export default TokenSettings;
