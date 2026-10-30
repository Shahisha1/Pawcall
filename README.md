# Pet Whistle

Call your tamed companions back to you with a single key press.

**Pet Whistle** is a small Fabric mod that lets you summon nearby owned pets without teleporting them. Your pets find their way to you using their normal navigation, so they actually travel back instead of instantly appearing at your feet.

## Features

- **Quick call:** Press `G` to call owned, tamed pets within 12 blocks.
- **Extended range:** Hold the Pet Whistle in either your main hand or offhand to call pets within 48 blocks.
- **No teleporting:** Pets pathfind toward your position.
- **Respect sitting:** Pets ordered to sit are left alone.
- **Ownership check:** Only pets belonging to the player who whistles will respond.
- **Cooldown:** A short one-second cooldown prevents repeated calls.

## How to use

1. Join a world with Pet Whistle installed.
2. Press `G` to call eligible pets within 12 blocks.
3. To use the extended 48-block range, hold the Pet Whistle in your main hand or offhand and press `G`.
4. Pets that are sitting will stay where they are.

The key is configurable in **Options → Controls → Key Binds**. Search for the Pet Whistle key binding if another control already uses `G`.

## Requirements

This project targets:

- Minecraft **26.3**
- Fabric Loader **0.20.1**
- Fabric API **0.165.0+26.3**
- Java **25 or newer**

Install Fabric Loader and the matching Fabric API version in the Minecraft instance where you want to use the mod.

## Installation

1. Install Fabric for Minecraft 26.3.
2. Install the matching Fabric API.
3. Download the Pet Whistle JAR from the project's GitHub Releases, when a release is available, or build it from source.
4. Place the JAR in your Minecraft instance's `mods` folder.
5. Launch the Fabric profile.

> **Note:** A GitHub source checkout is not itself a playable mod. Build the project to produce the mod JAR.

## Build from source

You will need Git and a Java 25 JDK.

Clone the repository:

```bash
git clone https://github.com/Shahisha1/pet-whistle.git
cd pet-whistle
```

Build with the included Gradle wrapper:

**Windows (PowerShell):**

```powershell
.\gradlew.bat build
```

**macOS / Linux:**

```bash
./gradlew build
```

After a successful build, look for the generated JAR in:

```
build/libs/
```

Copy the appropriate JAR into your Fabric instance's `mods` folder. Keep Fabric API installed as well.

To launch the development client:

**Windows:**

```powershell
.\gradlew.bat runClient
```

**macOS / Linux:**

```bash
./gradlew runClient
```

## Project details

| Property | Value |
| --- | --- |
| Mod name | Pet Whistle |
| Mod ID | `petwhistle` |
| Item ID | `petwhistle:whistle` |
| Default key | `G` |
| Normal call range | 12 blocks |
| Whistle call range | 48 blocks |
| License | MIT |

## Contributing

Bug reports, suggestions, and pull requests are welcome. When reporting a problem, include:

- Minecraft version
- Fabric Loader and Fabric API versions
- Java version
- Relevant log output from the failed launch or build
- Steps to reproduce the issue

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for the full license text.
