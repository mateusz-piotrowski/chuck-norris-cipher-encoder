# Chuck Norris Cipher Encoder (Kotlin)

## Description

This project is a console-based application written in Kotlin that encodes standard text messages into the Chuck Norris unary code. It converts standard characters to their 7-bit ASCII binary representation and then applies a unary encoding algorithm that transforms consecutive blocks of ones and zeros into blocks of zeros. This provides a fun and interesting way to obscure messages using only a single cipher character (`0`) and spaces.

## Motivation

This project was developed to practice console-based application development in Kotlin, focusing on string manipulation, binary conversions, and algorithmic encoding using loops and conditional logic.

## Stack & Requirements

- **Language:** Kotlin
- **Build System:** Gradle
- **JDK:** 17 or higher (recommended)

## Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your system.

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd "Chuck Norris Cipher Encoder (Kotlin)"
   ```
2. Open the project in an IDE that supports Kotlin (e.g., IntelliJ IDEA).

### Running the Application

You can run the `Main.kt` file directly from your IDE, which is located in `Chuck Norris Cipher Encoder (Kotlin)/task/src/chucknorris/Main.kt`.

Alternatively, use the Gradle wrapper from the command line:

```bash
./gradlew run
```

*Note: On Windows, use `gradlew.bat run`.*

## Scripts & Commands

- `./gradlew build`: Compiles the project and runs tests.
- `./gradlew run`: Executes the main application.
- `./gradlew test`: Runs the automated test suite.
- `./gradlew clean`: Deletes the build directory.

## Tests

The project includes tests powered by the `hs-test` framework. To run tests:

```bash
./gradlew test
```

## Project Structure

```text
.
├── Chuck Norris Cipher Encoder (Kotlin)
│   ├── task
│   │   ├── src/chucknorris/Main.kt     # Main entry point
│   │   └── test/                       # Project tests
│   └── ... (stage-specific task files)
├── build.gradle                   # Gradle build configuration
├── settings.gradle                # Gradle project settings
└── ...
```

## Environment Variables

No specific environment variables are required for this project.

## Code of Conduct

Please review our [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for expected behavior.

## Contributing

Please see our [CONTRIBUTING.md](CONTRIBUTING.md) for details on how to contribute to this project.

## Contributor

Mateusz Piotrowski

## License

MIT

## Badges

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)
