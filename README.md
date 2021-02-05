# Java Track Assessment

## Instructions

This repo contains the accessment exercise for the Javascript Track
Please perform the following instructions.

* Fork this repository.
* Clone the repository to your local computer.
* Add your solution to the specificied position.
* Commit your solution.
* Push your update to your repository.
* Submit your repository URL on the provided google form.

## Example

``` java
// src/com/solution/Solution.java

public static int getresult(String str)
{
    // your code goes here
}



public static void main(String[] args)
{
    if (args.length < 1)
    {
         System.exit(1);
    }
    String str = args[0];
    if (str.length() <= 0)
    {
         System.exit(2);
    }
    String output = Solution.getresult(str);
    System.out.print("Solution(" + str + ") = " + output + "\n");
}

```

## Requirements
[Ant](https://ant.apache.org/manual/index.html) Java build tool.
This build tools is avaliable within the repo at [lib/ant](./lib/ant/).
You can execute the build tool on both windows and mac.

## Running

``` shell
# compile the code using ant tooling on unix systems
# if have `ant` install in your global path
$: ant jar

# OR
$: ./lib/ant/bin/ant jar


# for windows systems 
$: lib\ant\bin\ant.bat jar

# run the jar file passing in argument
$: java -jar build/jar/solution-*.jar <input>
```

## Testing
``` shell
$: ant test
```


## Need Help?
contact: ***
