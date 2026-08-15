# Genuary Generative Art Showcase

A Processing application written in Java featuring generative art and dynamic geometry created for the Genuary daily coding prompt.

## Features

* **Concentric Shape Illusion:** Uses a descending `for` loop to draw alternating nested squares and circles centered on the canvas.
* **Dynamic Wave Rotation:** Rotates the shapes using a sinusoidal function (`sin(frameCount * 0.01f)`) to create a smooth, oscillating visual effect.
* **Color Gradients:** Alternates fill colors based on loop counts, producing depth and vibrant visual contrast.

## How to Run

1. Clone or download this repository.
2. Open the project in your Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
3. Ensure the **Processing core library** (`core.jar`) is added to your project dependencies/classpath.
4. Run `Main.java`.

## Requirements

* Java JDK 8 or higher
* Processing 3/4 `core.jar` library
