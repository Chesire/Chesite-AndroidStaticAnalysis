# Chesite-JavaStaticAnalysis
This is a repo used to store the code used for a post on [Chesite](https://github.com/Chesire/Chesite).
The repository contains the setup gradle files for CheckStyle, FindBugs and PMD.

To build the example, clone the repo, open in Android studio, and execute any of the verification tasks for:

* checkstyle
* findbugs
* pmd

There are currently lines of code that will fail each of these tests (checkstyle is configured to warn) in the MainActivity. After running these tasks the reports will be found in the `app/build/reports/task_name` directory.