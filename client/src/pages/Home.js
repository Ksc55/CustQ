import React from "react";
import Navbar from "../components/Navbar";
import { HashLink } from "react-router-hash-link";

const Home = () => {
  return (
    <>
      <Navbar />

      {/* hero section */}
      <div className=" relative flex flex-col items-center justify-center bg-[#BEC5FF] px-40 py-32">
        <p className="text-[#2E43FF] text-2xl italic font-montserrat">
          Put An End To Chaos, An Overtly-stretched Staff & Disgruntled
          Customers
        </p>
        <h1 className="text-[#2E43FF] text-7xl text-center my-6 italic font-montserrat">
          Create & Manage Queues Effectively
        </h1>
        <p className="text-2xl italic py-2 font-montserrat">
          & Collect Real-Time Data To Help You Effectively Manage Your Customers
          & Workflow.
        </p>
        <div className="flex flex-row py-12 gap-8">
          <HashLink smooth to="/signup">
            <button className=" bg-[#2E43FF] text-[#fff] border border-[#2E43FF] rounded-3xl py-3 px-10 my-8 flex items-center font-inter">
              Sign Up
            </button>
          </HashLink>
          <button className="bg-transparent text-[#2E43FF] border border-[#2E43FF] rounded-3xl py-3 px-6 my-8 flex items-center font-inter">
            <p className="mr-2">Watch Demo</p>
            <img
              className="w-6 h-6 cursor-pointer"
              src="/images/play-circle.svg"
              alt="Play Icon"
            />
          </button>
        </div>
        <img
          className="absolute top-10 left-32"
          src="/images/hero-obj1.svg"
          alt="hero-obj"
        />
        <img
          className="absolute bottom-64 left-96 w-12"
          src="/images/hero-obj1.svg"
          alt="hero-obj"
        />
        <img
          className="absolute bottom-32 right-96 w-20"
          src="/images/hero-obj1.svg"
          alt="hero-obj"
        />
        <img
          className="absolute top-24 right-72 w-8"
          src="/images/hero-obj1.svg"
          alt="hero-obj"
        />
      </div>

      {/* service section */}
      <div className="flex flex-col items-center justify-center bg-[#E5E5E5] px-28 py-10 font-montserrat">
        <div className="relative w-[900px]">
          <img
            src="/images/user-guide.svg"
            alt="userguide-svg"
            className="m-auto "
          ></img>
          <img
            className="absolute top-0 left-0 w-16 mt-[-25px] ml-[-30px] "
            src="/images/Flower.svg"
            alt="hero-obj"
          />
          <img
            className="absolute bottom-0 right-0 w-16 mr-[-30px] mb-[-20px] "
            src="/images/Flower.svg"
            alt="hero-obj"
          />
        </div>
        <h1 className="text-4xl italic py-6 ">
          Built On <span className="font-bold">OpenShift Technology,</span> We
          Help You:
        </h1>
        <div className="flex flex-row items-center justify-center gap-10 my-4">
          <div className="p-8 w-[300px] bg-[#FCF6F0] rounded-3xl mt-12">
            <h1 className="font-extrabold text-xl">Create & Manage Queues</h1>
            <p className="py-4 ">
              Create, organize, and oversee queues, ensuring a smooth and
              efficient flow for your customers and workforce.
            </p>
            <p className="text-sm">Read More</p>
          </div>
          <div className="p-8 w-[300px] bg-[#F1FFF2] rounded-3xl ">
            <h1 className="font-extrabold text-xl">
              Collect & Analyze Real-time Data
            </h1>
            <p className="py-4 ">
              Collect and analyze real-time data, empowering you with valuable
              insights to make informed decisions.
            </p>
            <p className="text-sm">Read More</p>
          </div>
          <div className="p-8 w-[300px] bg-[#F5E4D0] rounded-3xl mt-20">
            <h1 className="font-extrabold text-xl">
              Maintain Loyal & Delighted Customers
            </h1>
            <p className="py-4 ">
              Nurture lasting customer relationships By providing top-notch
              service and staying attuned to your customer needs
            </p>
            <p className="text-sm">Read More</p>
          </div>
        </div>
      </div>

      {/* steps section */}
      <div className="flex flex-col items-center justify-center bg-[#E5E5E5] px-28 py-16 font-montserrat ">
        <p className="text-2xl font-extrabold">
          Worried About the Technical Details?
        </p>
        <h1 className="text-5xl italic py-6 font-light text-center ">
          We've Got the
          <span className="font-bold text-[#BB6BFC]"> Complex Stuffs </span>
          Covered for You. Just:
        </h1>
        <div className="grid grid-cols-2 gap-6 my-8 p-8 ">
          <div className="relative flex flex-row items-center justify-center bg-[#BEC5FF] py-28 px-10 w-[550px] rounded-xl">
            <img
              src="/images/profile-circle.svg"
              alt="userguide-svg"
              className="absolute right-10 my-8 z-10 w-48"
            />
            <img
              className="absolute bottom-0 right-0 w-32"
              src="/images/Flowercut1.svg"
              alt="hero-obj"
            />
            <div className="flex flex-row z-20">
              <p className="text-[#2A3DE8] text-7xl rotate-[14.911deg] font-domine">
                1.
              </p>
              <p className="text-[#2A3DE8] text-4xl ">Create Your Account</p>
            </div>
          </div>
          <div className="relative flex flex-row items-center justify-center bg-[#E5C6FE] py-28 px-10 w-[550px] rounded-xl ">
            <img
              src="/images/people.svg"
              alt="userguide-svg"
              className="absolute right-10 my-8 z-10 w-48"
            />
            <img
              className="absolute bottom-0 left-0 w-24"
              src="/images/Flowercut2.svg"
              alt="hero-obj"
            />
            <div className="flex flex-row z-20">
              <p className="text-[#AA46FB] text-7xl rotate-[-10.162deg] font-domine">
                2.
              </p>
              <p className="text-[#AA46FB] text-4xl ">Create a Queue</p>
            </div>
          </div>
          <div className="relative flex flex-row items-center justify-center bg-[#BFFFC1] py-28 px-10 w-[550px] rounded-xl ">
            <img
              src="/images/graph.svg"
              alt="userguide-svg"
              className="absolute right-10 my-8 z-10 w-48"
            />
            <img
              className="absolute top-0 right-0 w-28"
              src="/images/Flowercut3.svg"
              alt="hero-obj"
            />
            <div className="flex flex-row z-20">
              <p className="text-[#3F8C43] text-7xl rotate-[18.667deg] font-domine">
                3.
              </p>
              <p className="text-[#3F8C43] text-4xl ml-2 ">
                Receive Insights From Analysed Data
              </p>
            </div>
          </div>
          <div className="relative flex flex-row items-center justify-center bg-[#F0D7B9] py-28 px-10 w-[550px] rounded-xl ">
            <img
              src="/images/shop.svg"
              alt="userguide-svg"
              className="absolute right-10 my-8 z-10 w-48"
            />
            <img
              className="absolute top-0 left-0 w-32"
              src="/images/Flowercut4.svg"
              alt="hero-obj"
            />
            <div className="flex flex-row z-20">
              <p className="text-[#7B5C39] text-7xl rotate-[-21.235deg] font-domine">
                4.
              </p>
              <p className="text-[#7B5C39] text-4xl ">Manage a Workflow</p>
            </div>
          </div>
        </div>
      </div>

      {/* cta section */}
      <div className="flex flex-col px-40 py-20 bg-[#E5E5E5]">
        <div className="bg-[#69E86E] relative px-32 py-8 items-center justify-center rounded-2xl">
          <img
            className="absolute top-0 left-0 w-32"
            src="/images/Flowercut4.svg"
            alt="hero-obj"
          />
          <img
            className="absolute bottom-0 right-0 w-32"
            src="/images/Flowercut1.svg"
            alt="hero-obj"
          />
          <img
            className="absolute top-0 right-20 w-32"
            src="/images/cutcube2.png"
            alt="hero-obj"
          />
          <img
            className="absolute bottom-10 left-20 w-32"
            src="/images/cutcubeobj1.svg"
            alt="hero-obj"
          />
          <h1 className="text-4xl italic py-6 text-center w-[700px] m-auto leading-20 ">
            Ready To Manage <span className="font-bold">Manage </span>
            Your Queue &
          </h1>
          <h1 className="text-4xl italic  text-center w-[700px] m-auto leading-20 ">
            <span className="font-bold">Simplify </span> Your Workflow?
          </h1>
          <HashLink smooth to="/signup">
            <button className=" bg-[#2E43FF] text-[#fff] border border-[#2E43FF] m-auto rounded-3xl py-3 px-20 my-12 flex items-center font-inter">
              Sign Up
            </button>
          </HashLink>
        </div>
      </div>

      {/* footer section */}
      <div className="bg-[#9FA9FF] px-60 py-12 font-montserrat">
        <div className="flex flex-row items-center justify-center gap-12">
          <div>
            <img
              src="/images/CustQ-Logo.svg"
              alt="CustQ-Logo.svg"
              className="my-2 w-32"
            />
          </div>
          <div className="flex flex-col">
            <h1 className="font-bold text-3xl">Keep in Touch With Us:</h1>
            <p className="text-xl font-light pt-4">
              Suscribe To Our Newsletter
            </p>
            <div className="relative flex flex-row rounded-3xl bg-[#fff] border my-4">
              <input
                type="text"
                className="rounded-3xl py-4 px-6 w-80"
                placeholder="Enter Email "
              />
              <button className=" bg-[#2E43FF] text-[#fff] border border-[#2E43FF] m-auto rounded-3xl py-3 px-6 mx-1 my-1 font-inter">
                Suscribe
              </button>
            </div>
            <div className="flex flex-row items-center justify-center gap-6">
              <HashLink smooth to="/">
                <div className="flex flex-row items-center justify-center ">
                  <img
                    src="/images/fb-logo.svg"
                    alt="fb-logo.svg"
                    className=""
                  />
                  <p className="text-xl text-[#2E43FF] ml-1">Facebook</p>
                </div>
              </HashLink>
              <HashLink smooth to="/">
                <div className="flex flex-row items-center justify-center ">
                  <img
                    src="/images/twitter-logo.svg"
                    alt="twiiter-logo.svg"
                    className=""
                  />
                  <p className="text-xl text-[#2E43FF] ml-1">Twitter</p>
                </div>
              </HashLink>
              <HashLink smooth to="/">
                <div className="flex flex-row items-center justify-center ">
                  <img
                    src="/images/linkedin-logo.svg"
                    alt="linkedin-logo.svg"
                    className=""
                  />
                  <p className="text-xl text-[#2E43FF] ml-1">Linkedin</p>
                </div>
              </HashLink>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Home;
