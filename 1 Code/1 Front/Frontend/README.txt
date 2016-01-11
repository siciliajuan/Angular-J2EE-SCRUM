
1- If you wanna prove yourself the tests on spec.js you need four things:

- Install Protractor 
		https://angular.github.io/protractor/#/
- Start webdriver-manager
		webdriver-manager start
- Run the AngularJS application on a server (I Use XAMP with an apache)
- Run Protractor
		protractor conf.js
		

2- To run this project on an apache server is necesary add 
   a .htaccess file on root folder with the next content:


----------------------------------------------------------------

RewriteEngine On
Options FollowSymLinks

RewriteBase /

RewriteCond %{REQUEST_FILENAME} !-f
RewriteCond %{REQUEST_FILENAME} !-d
RewriteRule ^(.*)$ /#/$1 [L] 


----------------------------------------------------------------

3- Make sure that all files on project has permissions to run 
   properly on apache.