import { useState } from "react";

import { Header } from "../components/Header/Header";
import { SubMenu } from "../components/SubMenu/SubMenu";
import { Cards } from "../components/Cards/Cards";
import { Footer } from "../components/Footer/Footer";

export const HomePage = () => {
  const [searchTerm, setSearchTerm] = useState("");

  const handleSearch = (searchTerm) => {
    setSearchTerm(searchTerm);
  };
  return (
    <>
      <Header onSearch={handleSearch} />
      <SubMenu />
      <Cards searchTerm={searchTerm} />
      <Footer />
    </>
  );
};
