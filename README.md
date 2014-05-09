Chapter 2 code examples
===================
The code from chapter 2 in [The Mikado Method book](http://www.manning.com/ellnestam/).

![Mikado Method book cover](http://www.manning.com/ellnestam/ellnestam_cover150.jpg)

There are two examples in that chapter, one really small and one a bit larger. 

The branches in the repo reflects the detailed steps in the refactoring.

Retrieve all branches
````
for remote in `git branch -r`; do git branch --track ${remote#origin/} $remote; done
git pull --all
````

## License
Copyright (c) 2013 Daniel Brolund & Ola Ellnestam  
Licensed under the MIT license.
