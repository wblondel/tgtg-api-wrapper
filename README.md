# tgtg-api-wrapper
tgtg-api-wrapper is a wrapper around the [TooGoodToGo](https://toogoodtogo.com/) API.

## Work in progress
Currently redacting the API structure in OpenAPI 3 standard.
A Python wrapper will be written next.

## List of API servers

The list of TooGoodToGo's API servers can be found at this address: https://meta.apptoogoodtogo.com/env/v1/list.json

As of 20 February 2024, the servers are:

| Name                     	| Public URL                                      	| "Hidden" URL                                                 	|
|--------------------------	|-------------------------------------------------	|--------------------------------------------------------------	|
| Production (Nearest)     	| https://apptoogoodtogo.com                      	| https://nearest-prod-backend-public.pr-be-shared.tgtg.ninja  	|
| Production (EU)          	| https://euw1.apptoogoodtogo.com                 	| https://prod-backend-public.prod-eks-1.tgtg.ninja            	|
| Production (US)          	| https://use1.apptoogoodtogo.com                 	| https://prod-backend-public.pr-be-use1.tgtg.ninja            	|
| Staging (Nearest)        	| https://backend-staging.apptoogoodtogo.com      	| https://nearest-staging-backend-public.dev-shared.tgtg.ninja 	|
| Staging (EU)             	| https://backend-staging-euw1.apptoogoodtogo.com 	| https://staging-backend-public.dev-euw1.tgtg.ninja           	|
| Staging (US)             	| https://backend-staging-use1.apptoogoodtogo.com 	| https://staging-backend-public.dev-use1.tgtg.ninja           	|
| Gold (EU) (Requires VPN) 	|                                                 	| https://gold-backend-internal.dev-euw1.tgtg.ninja            	|
| Gold (US) (Requires VPN) 	|                                                 	| https://gold-backend-internal.dev-use1.tgtg.ninja            	|
| Partner (EU)              | https://backend-partner-euw1.apptoogoodtogo.com   |                                                               |
| Partner (US)              | https://backend-partner-use1.apptoogoodtogo.com   |                                                               |
| QA (EU)                   | https://backend-qa-euw1.apptoogoodtogo.com        |                                                               |
| QA (US)                   | https://backend-qa-use1.apptoogoodtogo.com        |                                                               |
| Test1 (EU)               	| https://backend-test1.apptoogoodtogo.com        	| https://test1-backend-public.dev-euw1.tgtg.ninja             	|
| Test1 (US)               	| https://backend-test1-use1.apptoogoodtogo.com   	| https://test1-backend-public.dev-use1.tgtg.ninja             	|
| Test2 (EU)               	| https://backend-test2.apptoogoodtogo.com        	| https://test2-backend-public.dev-euw1.tgtg.ninja             	|
| Test2 (US)               	| https://backend-test2-use1.apptoogoodtogo.com   	| https://test2-backend-public.dev-use1.tgtg.ninja             	|
| Test3 (EU)               	| https://backend-test3.apptoogoodtogo.com        	| https://test3-backend-public.dev-euw1.tgtg.ninja             	|
| Test3 (US)               	| https://backend-test3-use1.apptoogoodtogo.com   	| https://test3-backend-public.dev-use1.tgtg.ninja             	|
| Test4 (EU)               	| https://backend-test4.apptoogoodtogo.com        	| https://test4-backend-public.dev-euw1.tgtg.ninja             	|
| Test4 (US)               	| https://backend-test4-use1.apptoogoodtogo.com   	| https://test4-backend-public.dev-use1.tgtg.ninja             	|
| Test5 (EU)               	| https://backend-test5.apptoogoodtogo.com        	| https://test5-backend-public.dev-euw1.tgtg.ninja             	|
| Test5 (US)               	| https://backend-test5-use1.apptoogoodtogo.com   	| https://test5-backend-public.dev-use1.tgtg.ninja             	|
| Test6 (EU)               	| https://backend-test6.apptoogoodtogo.com        	| https://test6-backend-public.dev-euw1.tgtg.ninja             	|
| Test6 (US)               	| https://backend-test6-use1.apptoogoodtogo.com   	| https://test6-backend-public.dev-use1.tgtg.ninja             	|
| Test7 (EU)               	| https://backend-test7.apptoogoodtogo.com        	| https://test7-backend-public.dev-euw1.tgtg.ninja             	|
| Test7 (US)               	| https://backend-test7-use1.apptoogoodtogo.com   	| https://test7-backend-public.dev-use1.tgtg.ninja             	|
| Test8 (EU)               	| https://backend-test8.apptoogoodtogo.com        	| https://test8-backend-public.dev-euw1.tgtg.ninja             	|
| Test8 (US)               	| https://backend-test8-use1.apptoogoodtogo.com   	| https://test8-backend-public.dev-use1.tgtg.ninja             	|
| Test9 (EU)               	| https://backend-test9.apptoogoodtogo.com        	| https://test9-backend-public.dev-euw1.tgtg.ninja             	|
| Test9 (US)               	| https://backend-test9-use1.apptoogoodtogo.com   	| https://test9-backend-public.dev-use1.tgtg.ninja             	|
| Test10 (EU)               | https://backend-test10.apptoogoodtogo.com        	| https://test10-backend-public.dev-euw1.tgtg.ninja             |
| Test10 (US)               | https://backend-test10-use1.apptoogoodtogo.com   	| https://test10-backend-public.dev-use1.tgtg.ninja             |
| Test11 (EU)               | https://backend-test11.apptoogoodtogo.com        	| https://test11-backend-public.dev-euw1.tgtg.ninja             |
| Test11 (US)               | https://backend-test11-use1.apptoogoodtogo.com   	| https://test11-backend-public.dev-use1.tgtg.ninja             |
| Test12 (EU)               | https://backend-test12.apptoogoodtogo.com        	| https://test12-backend-public.dev-euw1.tgtg.ninja             |
| Test12 (US)               | https://backend-test12-use1.apptoogoodtogo.com   	| https://test12-backend-public.dev-use1.tgtg.ninja             |
| Test13 (EU)               | https://backend-test13.apptoogoodtogo.com        	| https://test13-backend-public.dev-euw1.tgtg.ninja             |
| Test13 (US)               | https://backend-test13-use1.apptoogoodtogo.com   	| https://test13-backend-public.dev-use1.tgtg.ninja             |
| Test14 (EU)               | https://backend-test14.apptoogoodtogo.com        	| https://test14-backend-public.dev-euw1.tgtg.ninja             |
| Test14 (US)               | https://backend-test14-use1.apptoogoodtogo.com   	| https://test14-backend-public.dev-use1.tgtg.ninja             |
| Test15 (EU)               | https://backend-test15.apptoogoodtogo.com        	| https://test15-backend-public.dev-euw1.tgtg.ninja             |
| Test15 (US)               | https://backend-test15-use1.apptoogoodtogo.com   	| https://test15-backend-public.dev-use1.tgtg.ninja             |
| Test16 (EU)               | https://backend-test16.apptoogoodtogo.com        	| https://test16-backend-public.dev-euw1.tgtg.ninja             |
| Test16 (US)               | https://backend-test16-use1.apptoogoodtogo.com   	| https://test16-backend-public.dev-use1.tgtg.ninja             |
| Test17 (EU)               | https://backend-test17.apptoogoodtogo.com        	| https://test17-backend-public.dev-euw1.tgtg.ninja             |
| Test17 (US)               | https://backend-test17-use1.apptoogoodtogo.com   	| https://test17-backend-public.dev-use1.tgtg.ninja             |
| Test18 (EU)               | https://backend-test18.apptoogoodtogo.com        	| https://test18-backend-public.dev-euw1.tgtg.ninja            	|
| Test18 (US)              	| https://backend-test18-use1.apptoogoodtogo.com   	| https://test18-backend-public.dev-use1.tgtg.ninja             |
| Test19 (EU)              	| https://backend-test19.apptoogoodtogo.com        	| https://test19-backend-public.dev-euw1.tgtg.ninja             |
| Test19 (US)               | https://backend-test19-use1.apptoogoodtogo.com   	| https://test19-backend-public.dev-use1.tgtg.ninja             |
| Test20 (EU)               | https://backend-test20.apptoogoodtogo.com        	| https://test20-backend-public.dev-euw1.tgtg.ninja             |
| Test20 (US)               | https://backend-test20-use1.apptoogoodtogo.com   	| https://test20-backend-public.dev-use1.tgtg.ninja             |
| Test21 (EU)               | https://backend-test21.apptoogoodtogo.com        	| https://test21-backend-public.dev-euw1.tgtg.ninja             |
| Test21 (US)               | https://backend-test21-use1.apptoogoodtogo.com   	| https://test21-backend-public.dev-use1.tgtg.ninja             |
| Test22 (EU)               | https://backend-test22.apptoogoodtogo.com        	| https://test22-backend-public.dev-euw1.tgtg.ninja             |
| Test22 (US)               | https://backend-test22-use1.apptoogoodtogo.com   	| https://test22-backend-public.dev-use1.tgtg.ninja             |
| Test23 (EU)               | https://backend-test23.apptoogoodtogo.com        	| https://test23-backend-public.dev-euw1.tgtg.ninja             |
| Test23 (US)               | https://backend-test23-use1.apptoogoodtogo.com   	| https://test23-backend-public.dev-use1.tgtg.ninja             |
| Test24 (EU)               | https://backend-test24.apptoogoodtogo.com        	| https://test24-backend-public.dev-euw1.tgtg.ninja             |
| Test24 (US)               | https://backend-test24-use1.apptoogoodtogo.com   	| https://test24-backend-public.dev-use1.tgtg.ninja             |
| Test25 (EU)               | https://backend-test25.apptoogoodtogo.com        	| https://test25-backend-public.dev-euw1.tgtg.ninja             |
| Test25 (US)               | https://backend-test25-use1.apptoogoodtogo.com   	| https://test25-backend-public.dev-use1.tgtg.ninja             |
| Test26 (EU)               | https://backend-test26.apptoogoodtogo.com        	| https://test26-backend-public.dev-euw1.tgtg.ninja             |
| Test26 (US)               | https://backend-test26-use1.apptoogoodtogo.com   	| https://test26-backend-public.dev-use1.tgtg.ninja             |
| Test27 (EU)               | https://backend-test27.apptoogoodtogo.com        	| https://test27-backend-public.dev-euw1.tgtg.ninja             |
| Test27 (US)               | https://backend-test27-use1.apptoogoodtogo.com   	| https://test27-backend-public.dev-use1.tgtg.ninja             |
| Test28 (EU)               | https://backend-test28.apptoogoodtogo.com        	| https://test28-backend-public.dev-euw1.tgtg.ninja             |
| Test28 (US)               | https://backend-test28-use1.apptoogoodtogo.com   	| https://test28-backend-public.dev-use1.tgtg.ninja             |
| Test29 (EU)               | https://backend-test29.apptoogoodtogo.com        	| https://test29-backend-public.dev-euw1.tgtg.ninja             |
| Test29 (US)               | https://backend-test29-use1.apptoogoodtogo.com   	| https://test29-backend-public.dev-use1.tgtg.ninja             |
| Test30 (EU)               | https://backend-test30.apptoogoodtogo.com        	| https://test30-backend-public.dev-euw1.tgtg.ninja             |
| Test30 (US)               | https://backend-test30-use1.apptoogoodtogo.com   	| https://test30-backend-public.dev-use1.tgtg.ninja             |
| Pentest (EU)              | https://backend-pentest.apptoogoodtogo.com        |                                                               |
| Pentest (US)              | https://backend-pentest-use1.apptoogoodtogo.com   |                                                               |
| Bounty (EU)               | https://backend-bounty.apptoogoodtogo.com         |                                                               |
| Bounty (US)               | https://backend-bounty-use1.apptoogoodtogo.com    |                                                               |
| Partner (EU)              | https://backend-partner.apptoogoodtogo.com        |                                                               |
| Partner (US)              | https://backend-partner-use1.apptoogoodtogo.com   |                                                               |
| QA (EU)                   | https://backend-qa.apptoogoodtogo.com             |                                                               |
| QA (US)                   | https://backend-qa-use1.apptoogoodtogo.com        |                                                               |



The base path for the API is `/api/`.

The documentation seems to be at `/api/api-docs` but is only accessible through their VPN.

A GET request to `/web` throws a 403 Forbidden error with the message "Invalid CSRF token".

A GET request to `/logout` redirects (302) to `/login?logout`, which throws a 404 Not Found error.

A GET request to `/ping` returns `pong` :D

A GET request to `/api/` on a public URL redirects (302) to `/api/api-docs` on the corresponding "Hidden" server.

The APIs seem to be built with Spring Boot (clue: the `Whitelabel Error Page`)
