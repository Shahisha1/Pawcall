# Pet Whistle

<p align="center">
  <strong>Never lose track of your furry sidekicks again.</strong>
  <br />
  A simple whistle. A familiar sound. And your companions come running.
  <br /><br />
  <a href="https://fabricmc.net/"><img src="https://img.shields.io/badge/Mod%20loader-Fabric-dbd0b4?style=for-the-badge&logo=fabric&logoColor=111111" alt="Fabric" /></a>
  <img src="https://img.shields.io/badge/Minecraft-26.3-4b8b3b?style=for-the-badge&logo=minecraft&logoColor=white" alt="Minecraft 26.3" />
  <img src="https://img.shields.io/badge/Java-25+-e76f00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 25 or newer" />
  <img src="https://img.shields.io/badge/License-MIT-287a66?style=for-the-badge" alt="MIT License" />
</p>

---

## Your pets. Your call.

Exploring is better with company, but your pets don't always keep up. **Pet Whistle** gives you a quick way to call your tamed companions back to you.

Tap **G** and nearby pets will make their way over. Equip the crafted Pet Whistle in either hand to reach much farther. No instant teleporting, no dragging sitting pets away from their spots. Just a little help keeping your crew together.

## The whistle at a glance

| Call type | What to do | Range |
| :--- | :--- | :---: |
| **Quick call** | Press `G` with any item or an empty hand | **12 blocks** |
| **Whistle call** | Hold the Pet Whistle in either hand and press `G` | **48 blocks** |

## Made for your companions

- **They come running.** Pets use their navigation to travel toward you instead of teleporting.
- **A much bigger reach.** The Pet Whistle expands your calling range from 12 to 48 blocks.
- **Your sitting pets stay put.** Companions ordered to sit are not called.
- **Your pets only.** The whistle responds only to tamed animals owned by the player who used it.
- **A little breathing room.** A one-second cooldown keeps repeated calls from firing constantly.

## How to use

1. Install Pet Whistle in your Fabric Minecraft instance.
2. Press **G** to call your owned, tamed pets within 12 blocks.
3. Want to reach farther? Hold the Pet Whistle in your main hand or offhand.
4. Press **G** again. Eligible pets within 48 blocks will start making their way to you.

The default key is **G**. You can change it under **Options → Controls → Key Binds**. Search for the Pet Whistle binding if another action already uses that key.

## Installation

### Requirements

| Component | Required version |
| :--- | :--- |
| Minecraft | **26.3** |
| Fabric Loader | **0.20.1** |
| Fabric API | **0.165.0+26.3** |
| Java | **25 or newer** |

### Install the mod

1. Install Fabric Loader for Minecraft 26.3.
2. Install the matching Fabric API version.
3. Get the Pet Whistle JAR from [GitHub Releases](https://github.com/Shahisha1/pet-whistle/releases) when a release is available, or [build it yourself](#build-from-source).
4. Put the JAR in the `mods` folder of the Minecraft instance you use.
5. Launch the Fabric profile and get exploring.

> **Heads-up:** Downloading the source code from GitHub does not give you a ready-to-play mod JAR. If there is no published release yet, build the project using the steps below.

## Build from source

Want to build it yourself or help improve it? You'll need **Git** and a **Java 25 JDK**.

Clone the repository:

```bash
git clone https://github.com/Shahisha1/pet-whistle.git
cd pet-whistle
```

Build the mod:

**Windows (PowerShell)**

```powershell
.\gradlew.bat build
```

**macOS / Linux**

```bash
./gradlew build
```

Once Gradle finishes successfully, the generated JAR will be in:

```
build/libs/
```

Copy the appropriate JAR into your Fabric instance's `mods` folder. Make sure the matching Fabric API is installed too.

### Run the development client

**Windows**

```powershell
.\gradlew.bat runClient
```

**macOS / Linux**

```bash
./gradlew runClient
```

## Project information

| Detail | Value |
| :--- | :--- |
| Project | Pet Whistle |
| Mod ID | `petwhistle` |
| Whistle item ID | `petwhistle:whistle` |
| Default keybind | `G` |
| Standard range | 12 blocks |
| Whistle range | 48 blocks |
| License | MIT |

## Found a bug or have an idea?

Contributions, bug reports, and suggestions are welcome.

When reporting an issue, include:

- Minecraft version
- Fabric Loader and Fabric API versions
- Java version
- Relevant game or crash log
- Steps to reproduce the problem

That information makes it much easier to track down what's happening.

## License

Pet Whistle is released under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

<p align="center">
  <strong>Adventure is better with company.</strong>
  <br />
  <sub>Made for the pets that never quite know where you're going.</sub>
</p>
