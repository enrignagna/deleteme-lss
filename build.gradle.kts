plugins {
    id ("org.danilopianini.git-sensitive-semantic-versioning") version "0.1.0"
}
gitSemVer {
    version = computeGitSemVer() // THIS IS MANDATORY, AND MUST BE LAST IN BLOCK
}