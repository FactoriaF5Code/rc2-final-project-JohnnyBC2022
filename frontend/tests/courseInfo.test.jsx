import { render, screen } from "@testing-library/react";
import "@testing-library/jest-dom/vitest";
import { expect } from "vitest";
import App from "../src/App";
import "./testServer";

test("the card shows the course information", async () => {
  render(<App />);

  const findCourseName = screen.findByText(/Iniciación a HTML/);
  expect(await findCourseName).toBeInTheDocument();
  const findDescription = screen.findByText(
    /Aprende los fundamentos de HTML y cómo crear estructuras básicas para páginas web./
  );
  expect(await findDescription).toBeInTheDocument();
  const findPrice = screen.findByText(/Gratis/);
  expect(await findPrice).toBeInTheDocument();
});
