# Pawcall

<p align="center">
  <strong>A little whistle. A long way home.</strong>
  <br />
  Call your tamed companions back to you, without teleporting them.
  <br /><br />
  <a href="https://www.curseforge.com/minecraft/mc-mods/pawcall"><img src="https://img.shields.io/badge/Download-CurseForge-f16436?style=for-the-badge&logo=curseforge&logoColor=white" alt="Download on CurseForge" /></a>
  <a href="https://fabricmc.net/"><img src="https://img.shields.io/badge/Mod%20loader-Fabric-dbd0b4?style=for-the-badge&logo=fabric&logoColor=111111" alt="Fabric" /></a>
  <img src="https://img.shields.io/badge/Minecraft-26.3-4b8b3b?style=for-the-badge&logo=minecraft&logoColor=white" alt="Minecraft 26.3" />
  <img src="https://img.shields.io/badge/Java-25+-e76f00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 25 or newer" />
  <img src="https://img.shields.io/badge/License-MIT-287a66?style=for-the-badge" alt="MIT License" />
</p>

---

## Your pets. Your call.

Exploring is better with company, but your pets don't always keep up. **Pawcall** gives you a quick way to call your tamed companions back to you.

Press **G** and nearby pets will make their way over. Hold the crafted Pawcall whistle in either hand to reach much farther. No instant teleporting, no disturbing pets that are sitting. Just a little help keeping your crew together.

## Calling modes

| Call type | What to do | Range |
| :--- | :--- | :---: |
| **Quick call** | Press `G` with any item or an empty hand | **12 blocks** |
| **Whistle call** | Hold the Pawcall whistle in either hand and press `G` | **48 blocks** |

## Made for your companions

- **They come running.** Pets use their navigation to travel toward you instead of teleporting.
- **A much bigger reach.** The whistle expands your calling range from 12 to 48 blocks.
- **Your sitting pets stay put.** Companions ordered to sit are not called.
- **Your pets only.** Only tamed animals owned by the player who called respond.
- **A little breathing room.** A one-second cooldown prevents repeated calls from firing constantly.

## Crafting the whistle

Place an **iron ingot** above a **bone** in a crafting grid. The whistle also appears in the Tools & Utilities creative tab. Right-clicking it calls your pets too.

## How to use

1. Install Pawcall in your Fabric Minecraft instance.
2. Press **G** to call your owned, tamed pets within 12 blocks.
3. To reach farther, hold the Pawcall whistle in your main hand or offhand.
4. Press **G** again. Eligible pets within 48 blocks will start making their way to you.

The default key is **G**. You can change it under **Options → Controls → Key Binds**.

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
3. Download the Pawcall JAR from [CurseForge](https://www.curseforge.com/minecraft/mc-mods/pawcall) or [GitHub Releases](https://github.com/Shahisha1/Pawcall/releases), or [build it yourself](#build-from-source).
4. Put the JAR in the `mods` folder of your Minecraft instance.
5. Launch the Fabric profile and get exploring.

> **Heads-up:** Downloading the source code from GitHub does not give you a ready-to-play mod JAR. If there is no published release yet, build the project using the steps below.

## Build from source

You'll need **Git** and a **Java 25 JDK**.

```bash
git clone https://github.com/Shahisha1/Pawcall.git
cd Pawcall
```

**Windows (PowerShell)**

```powershell
.\gradlew.bat build
```

**macOS / Linux**

```bash
./gradlew build
```

The generated JAR will be in `build/libs/`. Copy it into your Fabric instance's `mods` folder.

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
| Project | Pawcall |
| Mod ID | `pawcall` |
| Whistle item ID | `pawcall:whistle` |
| Whistle recipe | Iron ingot above a bone |
| Default keybind | `G` |
| Standard range | 12 blocks |
| Whistle range | 48 blocks |
| License | MIT |

## Found a bug or have an idea?

Contributions, bug reports, and suggestions are welcome. Include your Minecraft, Fabric Loader, Fabric API, and Java versions, relevant logs, and steps to reproduce the issue.

## License

Pawcall is released under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

<p align="center">
  <strong>A little whistle. A long way home.</strong>
</p>
