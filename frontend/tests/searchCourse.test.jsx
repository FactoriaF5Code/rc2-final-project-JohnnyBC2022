import { render, screen } from "@testing-library/react";
import "@testing-library/jest-dom/vitest";
import { beforeAll, expect } from "vitest";
import userEvent from "@testing-library/user-event";
import App from "../src/App";
import { setupServer } from "msw/node";
import { HttpResponse, http } from "msw";

const handlers = [
  http.get("http://localhost:8080/api/courses", ({ request }) => {
    return HttpResponse.json([
      {
        id: "68ec1461-7914-4ac0-9600-1c6921cf078d",
        imageUrl:
          "https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        courseName: "Iniciación a HTML",
        description:
          "Aprende los fundamentos de HTML y cómo crear estructuras básicas para páginas web.",
        price: "Gratis",
      },
    ]);
  }),
];

const server = setupServer(...handlers);

beforeAll(() => server.listen());
afterAll(() => server.close());

test("we can search for a course", async () => {
  render(<App />);
  const searchBar = screen.getByPlaceholderText(/Buscar/);
  await userEvent.type(searchBar, "HTML");
  expect(await screen.findByText(/Iniciación a HTML/)).toBeInTheDocument();
});
