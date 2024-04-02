import "./App.css";
import { Cards } from "./presentation/components/Cards/Cards";
import { Footer } from "./presentation/components/Footer/Footer";
import { Header } from "./presentation/components/Header/Header";
import { SubMenu } from "./presentation/components/SubMenu/SubMenu";

function App() {
  return (
    <>
      <Header />
      <SubMenu />
      <Cards />
      <Footer />
    </>
  );
}

export default App;
