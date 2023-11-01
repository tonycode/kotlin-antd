Contributing
============

## Conventional Commits

based on guides:

- https://www.conventionalcommits.org/en/v1.0.0/
- https://github.com/angular/angular/blob/22b96b9/CONTRIBUTING.md#-commit-message-guidelines

```
type[(scope)]: description

body

footer
```

- types
    - feat - A new feature
    - fix - A bug fix
    - refactor - A code change that neither fixes a bug nor adds a feature
    - style - Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
    - docs - Documentation only changes
    - build - Changes that affect the build system or external dependencies
    - ci - Changes to our CI configuration files and scripts
- scopes
    - demo - Changes related to demonstrational web-application
- description
    - use the imperative, present tense: "change" not "changed" or "changes"
        - It tells someone what applying the commit will do, rather than what you did
    - include motivation for the change, and contrasts its implementation with previous behaviour
    - 80 chars or fewer
