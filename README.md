# CSC120-A3: Chatbot

## Outline
This assignment has two main purposes. The first is to help you become familiar with some of the resources available to help you succeed in the course, and get you used to using them. The second is to review the programming concepts you learned in CSC 111 (or its equivalent), while beginning your introduction to Java. This assignment should use techniques and ideas that are already familiar to you, but implementing them using the Java syntax and compiler will be new.

You will document your work on the assignment in a written journal entry. These reflections, which you will be completing each week, will normally serve as a chance to consider and describe what you have learned from the assignment, any areas where you had trouble, etc. For this assignment in particular, you will augment it with the information described below. This part of each week's assignment should be prepared alongside the code, in a file called ``reflection.md``. It is described more below.

All the files necessary for this assignment are contained within this repository. In general for each assignment you should always include:
* all files necessary to compile your program
* ``reflection.md`` containing your reflections and notes
* ``checklist.md`` where you document which elements of the assignment you have attempted and/or completed.
* future assignments may also ask for additional specific elements

## Resource Exploration
Most experiences are more fun when shared, and programming is no exception. Your classmates can serve as a source of support, inspiration, and ideas. Read the policy on collaboration in the syllabus and notice how much freedom it gives you to discuss the project with your peers. I want you to use that freedom!

Find at **least two classmates** with whom you can discuss this assignment. I recommend doing this before you start writing the program, but don't use this as an excuse to delay an early start. You may fulfill this requirement at any point before submitting your ``readme.md``. Make sure you identify which classmates you talked with (since this is mutual, they should also identify you in their reflection!), and any way that the conversation changed your thinking about the assignment.

Check the professor's office hours and the TA help session hours, and attend at least one. Record in your journal entry which one(s) you attended, and any way that it changed your thinking about the assignment.

## Program: `Conversation.java`
For the main part of the assignment, you will write in Java a program similar to those you might have written in CSC 111. Your program will carry on a simple conversation with the user. The program you will write is a simple chatbot, a form originally popularized by the [program called Eliza](http://psych.fullerton.edu/mbirnbaum/psych101/eliza.htm). It will ask the user to choose a number of rounds of conversation in advance. Then it will take turns printing messages to the user and accepting responses until the specified number of rounds are complete. Finally it will print a transcript of the entire conversation.

If at any point the user's input contains words that can be mirrored ("I" <-> "you" for example) then the computer's next response will be a mirrored version of the previous statement. Otherwise it will select from a set of canned phrases. Below is one sample conversation:

```
$ java Conversation
How many rounds?  2

Hi there!  What's on your mind?
I'm thinking about clouds.
You're thinking about clouds?
Yes, but nothing very profound.
Mmm-hm.
See ya!

TRANSCRIPT:
Hi there!  What's on your mind?
I'm thinking about clouds.
You're thinking about clouds?
Yes, but nothing very profound.
Mmm-hm.
See ya!
```

Your program should be able to mirror the following sets of words, at minimum:
* I -> you
* me -> you
* am -> are
* you -> I
* my -> your
* your -> my

You may expand this list if you wish.


## Hints
Start early on this assignment so as to give yourself plenty of time. Although you may have written a similar program before, many things are different with Java.

For this assignment, you will not be required to catch `Exceptions` that might be generated by the user entering unexpected input (such as something non-numeric for the number of conversation rounds). You also shouldn't worry yet about creating multiple classes; a single class with static fields and methods will do.  For this assignment you may put the bulk of your program inside the `main(...)` method.

Because Java has an extensive web presence, you may be able to find code on the web related to this and other assignments. Resist the temptation to copy from these sources! Code taken from the web will not necessarily meet the requirements of this assignment, even if it solves the same general problem. Furthermore, representing someone else's work as your own is a violation of the Honor Code. (That said, looking at related examples for ideas and general concepts is acceptable, so long as you cite your sources and then proceed to write the program on your own.)

## Grading
The file ``checklist.md`` shows the items on which your program will be graded.  As before, you are asked to enter your own assessment of these points and submit it with the rest of your work.  _Some advice:  S^4! Don't try to write everything first and then debug all at once.  First priority is to get a basic program running; you can add and debug features once you have the framework established._

Your written reflection will be graded only based on the thought and effort displayed by the entry; all reasonable submissions will receive full credit. For this assignment, the reflection should describe the differences between Python and Java you experienced while completing the assignment. 

- What are your initial impressions of Java? 
- Can you draw any conclusion about programming in general from the similarities or the differences between the two languages? 

You may also use the reflection as a means of expressing to us parts of the assignment that you found difficult, did not complete, etc. Do not fear that your grade will be lowered because you tell us that something is unclear to you; in grading, we will rely only on the evidence of the programs and typescript you submit. The reflection serves simultaneously as a means of self-improvement for the student, a form of feedback for the professors, and a way for the class to share ideas as a group. A final reminder: don't forget to tell us which TA session(s) you visited!
