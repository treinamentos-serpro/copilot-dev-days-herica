# AGENTS.md

## Mandatory development checklist
- [ ] Lint/format check if available
- [ ] Build: `cd socops && ./mvnw clean package`
- [ ] Test: `cd socops && ./mvnw test`
- [ ] Run locally if needed: `cd socops && ./mvnw spring-boot:run`

## Project
This repo contains Soc Ops, a Spring Boot 3.4.2 social bingo app. Code is in [socops](socops/); workshop docs are in [workshop](workshop/).

## Commands
- Build: `cd socops && ./mvnw clean package`
- Test: `cd socops && ./mvnw test`
- Run: `cd socops && ./mvnw spring-boot:run`

## Architecture
- Entry point: [socops/src/main/java/com/socops/SocOpsApplication.java](socops/src/main/java/com/socops/SocOpsApplication.java)
- Web/API: [socops/src/main/java/com/socops/web/BingoRestController.java](socops/src/main/java/com/socops/web/BingoRestController.java)
- Board logic: [socops/src/main/java/com/socops/service/BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java)
- Tests: [socops/src/test/java/com/socops/service/BoardAssemblerTests.java](socops/src/test/java/com/socops/service/BoardAssemblerTests.java)
- UI: [socops/src/main/resources/templates/game.html](socops/src/main/resources/templates/game.html)

## Conventions
- Keep logic pure and stateless where possible.
- Prefer small, focused tests for logic changes.
- Do not add test-only production methods.
- Keep edits narrow and aligned with the existing structure.
- Prefer the repo’s Maven wrapper over a separate local Maven install.

## Docs
- [README.md](README.md)
- [workshop/GUIDE.md](workshop/GUIDE.md)
- [.github](.github)

## Environment
- Java 21 required.
- Port 8080 is default; stop stale processes before restarting.
