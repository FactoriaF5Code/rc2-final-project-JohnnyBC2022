import { render, screen } from "@testing-library/react";
import "@testing-library/jest-dom/vitest";
import { expect } from "vitest";
import userEvent from "@testing-library/user-event";
import App from "../src/App";
import "./testServer"

test("Search view", ()=>{
  render(<App />);
  const searchBar = screen.getByPlaceholderText(/Buscar/);
  expect(searchBar).toBeInTheDocument();

    expect(screen.queryByText(/Iniciación a Javascript/)).not.toBeInTheDocument();

})

test("user can search for a course", async () => {
  render(<App />);
  const searchBar = screen.getByPlaceholderText(/Buscar/);
  await userEvent.type(searchBar, "HTML");
  const typeText = screen.findByText(/Iniciación a HTML/)
  expect(await typeText).toBeInTheDocument();
});
