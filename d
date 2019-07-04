[1mdiff --git a/src/main/java/com/master/springsecurity/controller/AdminController.java b/src/main/java/com/master/springsecurity/controller/AdminController.java[m
[1mindex 6d22de0..50bc91b 100644[m
[1m--- a/src/main/java/com/master/springsecurity/controller/AdminController.java[m
[1m+++ b/src/main/java/com/master/springsecurity/controller/AdminController.java[m
[36m@@ -19,6 +19,8 @@[m [mpublic class AdminController {[m
     @GetMapping("/test")[m
 public String testAdmin(){[m
 [m
[32m+[m[32m        int a=5;[m
[32m+[m[32m        int b=6;[m
     return "This test is for Admin...";[m
 }[m
 [m
[36m@@ -29,4 +31,4 @@[m [mpublic String addUser(@RequestBody User user){[m
         return "User added...";[m
 [m
 }[m
[31m-}[m
[32m+[m[32m}[m
\ No newline at end of file[m
