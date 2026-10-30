# Pawcall

**Pawcall is a Fabric mod for Minecraft Java Edition that calls nearby tamed pets you own.** Press `G` for a 12-block call, or hold the Pawcall whistle in either hand for a 48-block call. Pets move toward you using normal navigation; they are not teleported.

[**Download on CurseForge**](https://www.curseforge.com/minecraft/mc-mods/pawcall) · [Source code](https://github.com/Shahisha1/Pawcall) · [Report a bug](https://github.com/Shahisha1/Pawcall/issues)

## Compatibility

| Component | Required version |
| :--- | :--- |
| Minecraft Java Edition | **26.3** |
| Fabric Loader | **0.20.1** |
| Fabric API | **0.165.0+26.3** |
| Java | **25 or newer** |

Use these versions together. Pawcall's current build targets Minecraft 26.3.

## Calling modes

| Mode | Trigger | Range | Whistle required? |
| :--- | :--- | :---: | :---: |
| Quick call | Press `G` | **12 blocks** | No |
| Whistle call | Press `G` while holding the whistle in either hand | **48 blocks** | Yes |
| Direct whistle use | Right-click the whistle | **48 blocks** | Yes |

The default key is `G`. Change it under **Options → Controls → Key Binds**. Calls share a one-second cooldown.

## Which pets respond?

Pawcall searches for Minecraft `TamableAnimal` entities that:

- Are tamed.
- Are owned by the player making the call.
- Are within the selected range in the player's current dimension.
- Have not been ordered to sit.

Wolves and cats are familiar examples of this entity type. Pawcall does not call every animal in the world, untamed animals, another player's pets, or pets sitting in place.

## How pet movement works

Pawcall asks each matching pet's navigation system to move toward the player at movement speed **1.25**. It does not teleport pets.

This is a movement request, not a guarantee that every pet will arrive. Terrain, walls, hazards, an unreachable route, or other in-game conditions can prevent pathfinding from completing.

## Crafting the whistle

Use a crafting grid and place:

| Row | Column 1 | Column 2 | Column 3 |
| :--- | :--- | :--- | :--- |
| Top | 1 iron ingot | Empty | Empty |
| Middle | 1 bone | Empty | Empty |
| Bottom | Empty | Empty | Empty |

The recipe produces **one Pawcall whistle**. The item is also listed in the Tools & Utilities creative tab.

## Installation

1. Install Fabric Loader **0.20.1** for Minecraft **26.3**.
2. Add Fabric API **0.165.0+26.3** to the same Minecraft instance.
3. Download the Pawcall JAR from [CurseForge](https://www.curseforge.com/minecraft/mc-mods/pawcall) or [GitHub Releases](https://github.com/Shahisha1/Pawcall/releases).
4. Put the JAR in that instance's `mods` folder.
5. Launch the Fabric profile.

If no compiled JAR is published yet, build from source using the steps below.

## Build from source

You'll need Git and a **Java 25 JDK**.

```bash
git clone https://github.com/Shahisha1/Pawcall.git
cd Pawcall
```

**Windows (PowerShell)**

```powershell
.\\gradlew.bat build
```

**macOS / Linux**

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`. Copy it into your Fabric instance's `mods` folder.

To launch the development client:

**Windows**

```powershell
.\\gradlew.bat runClient
```

**macOS / Linux**

```bash
./gradlew runClient
```

## Project details

| Detail | Value |
| :--- | :--- |
| Mod ID | `pawcall` |
| Whistle item ID | `pawcall:whistle` |
| Default keybind | `G` |
| Quick-call range | 12 blocks |
| Whistle-call range | 48 blocks |
| Cooldown | 20 ticks (1 second) |
| License | MIT |

## Contributing

Bug reports and contributions are welcome. Include your Minecraft, Fabric Loader, Fabric API and Java versions, relevant logs, and steps to reproduce the issue.

## License

Pawcall is released under the **MIT License**. See [LICENSE](LICENSE).
