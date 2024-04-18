import { expect, test } from "vitest";
import {Cards} from "../src/presentation/components/Cards/Cards";
import { render, screen } from "@testing-library/react";

test("the component render the list of all courses", () => {
    render(<Cards />);

    expect(screen.getByText(/HTML/)).toBeInTheDocument()
    expect(screen.getByText(/CSS/)).toBeInTheDocument()
    expect(screen.getByText(/Javascript/)).toBeInTheDocument()
    expect(screen.getByText(/React/)).toBeInTheDocument()
    expect(screen.getByText(/PostreSQL/)).toBeInTheDocument()
})