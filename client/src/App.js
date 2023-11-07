import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from "./pages/login";
import Signup from "./pages/Signup";
import Error404 from "./pages/Error404";
import Otpverify from "./pages/Otpverify";
import DeleteConfirm from "./pages/DeleteConfirm";
import ResetConfirm from "./pages/ResetConfirm";
import TokenCreation from "./pages/TokenCreation";

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<Signup />} />
          <Route path="/signup" element={<Signup />} />
          <Route path="/otpverify" element={<Otpverify />} />
          <Route path="/login" element={<Login />} />
          <Route path="/deleteconfirm" element={<DeleteConfirm />} />
          <Route path="/resetconfirm" element={<ResetConfirm />} />
          <Route path="/tokencreation" element={<TokenCreation />} />
          <Route path="*" element={<Error404 />} />
          <Route path="/error404" element={<Error404 />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
