/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

#import "AppDelegate.h"

#import "RCTBundleURLProvider.h"
#import "RCTRootView.h"

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
  
  NSDictionary *appDefaults = @{
                                @"host_preference": @"localhost",
                                @"port_preference": @"8081",
                                };
  [[NSUserDefaults standardUserDefaults] registerDefaults:appDefaults];
  
  NSURL *jsCodeLocation;
  
  NSString *host = [[NSUserDefaults standardUserDefaults] stringForKey: @"host_preference"];
  NSString *port = [[NSUserDefaults standardUserDefaults] stringForKey: @"port_preference"];
  
  NSLog(@"host: %@", host);
  NSLog(@"port: %@", port);
  
  NSString * urlString = [NSString stringWithFormat: @"http://%@:%@/index.ios.bundle?platform=ios&dev=true", host, port];

  jsCodeLocation = [[RCTBundleURLProvider sharedSettings] jsBundleURLForBundleRoot:@"index.ios" fallbackResource:nil];

  NSLog(@"jsCodeLocation = %@", jsCodeLocation.absoluteURL);
  
  jsCodeLocation = [NSURL URLWithString: urlString];
 
  NSLog(@"jsCodeLocation = %@", jsCodeLocation.absoluteURL);
  
  RCTRootView *rootView = [[RCTRootView alloc] initWithBundleURL:jsCodeLocation
                                                      moduleName:@"TodoApp"
                                               initialProperties:nil
                                                   launchOptions:launchOptions];
  rootView.backgroundColor = [[UIColor alloc] initWithRed:1.0f green:1.0f blue:1.0f alpha:1];

  self.window = [[UIWindow alloc] initWithFrame:[UIScreen mainScreen].bounds];
  UIViewController *rootViewController = [UIViewController new];
  rootViewController.view = rootView;
  self.window.rootViewController = rootViewController;
  [self.window makeKeyAndVisible];
  return YES;
}

@end
