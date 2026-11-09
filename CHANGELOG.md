# Changelog

All notable changes to Pawcall are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/), and this project follows [Semantic Versioning](https://semver.org/spec/v2.0.0.html) where practical for mod releases.

## [Unreleased]

### Changed
- Refreshed project metadata and documentation for release readiness.
- Updated the Java package namespace from the placeholder `com.example` layout to `com.shahisha1.pawcall`.
- Aligned Fabric mod dependency metadata with the tested Minecraft 26.3 target.

## [1.0.0] - 2026-11-09

### Added
- Quick pet call bound to `G` with a 12-block range.
- Whistle-assisted call with a 96-block range when holding the Pawcall whistle, plus direct whistle use.
- Pawcall whistle item, crafting recipe, model, texture, and language entries.
- Server-side pet lookup for tamed, player-owned, non-sitting `TamableAnimal` entities in the current dimension.
- Navigation-based pet recall (pets move toward the player; no teleporting).
- One-second cooldown between calls and player feedback messages.

[Unreleased]: https://github.com/Shahisha1/Pawcall/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/Shahisha1/Pawcall/releases/tag/v1.0.0
