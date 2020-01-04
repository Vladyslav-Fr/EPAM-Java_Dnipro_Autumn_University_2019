Project description and start up instructions
-------------------------------------

The task starts with the developer viewing menu and include some submenu. 

In the console menu, you can create an account and skills that make up 
the central table with the developers.

Developer, skills, account are stored in three different data storage 
files. The account number is the same as the developer number. 
You can add any number of skills to any developer.

The account and the developer are never deleted. 
Only their status changes, which allows you to restore the record 
at any time.

To start, you need to run the AppRunner file.

Have a nice use.

-------------------------------------

Original task:
-------------------------------------

Practice:

You have to implement console CRUD application that has next entities:
Developer
Skill
Account
AccountStatus (enum ACTIVE, BANNED, DELETED)

Developer -> Set<Skill> skills + Account account
Account -> AccountStatus

Use text files as a storage:
developers.txt, skills.txt, accounts.txt

User should be able to create, read, update and delete data.


Layers:
model - POJO classes
repository - classes that provide access to text files controller - user’s requests handling
view - all data that are required for user/console interaction.

Example: Developer, DeveloperRepository, DeveloperController, DeveloperView и т.д.


Try to use basic interface for repository layer:
interface GenericRepository<T,ID>

interface DeveloperRepository extends GenericRepository<Developer, Long>

class JavaIODeveloperRepositoryImpl implements DeveloperRepository

As a result of this task you should create new github repository with README.md file, that contains task and project description and start up instructions.

Basic functionality should be covered with unit tests.

User travis (https://travis-ci.com/) to show project build status.