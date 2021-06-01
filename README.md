# tgtg-api-wrapper
tgtg-api-wrapper is a wrapper around the [TooGoodToGo](https://toogoodtogo.com/) API.

## Work in progress
Currently redacting the API structure in OpenAPI 3 standard.
A Python wrapper will be written next.

## List of API servers

The list of TooGoodToGo's API servers can be found at this address: https://meta.apptoogoodtogo.com/env/v1/list.json

On 31st May, 2021, the servers are:

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

The base path for the API is `/api/`.

The documentation seems to be at `/api/api-docs` but is only accessible through their VPN.

A GET request to `/web` throws a 403 Forbidden error with the message "Invalid CSRF token".

A GET request to `/logout` redirects (302) to `/login?logout`, which throws a 404 Not Found error.

A GET request to `/ping` returns `pong` :D

A GET request to `/api/` on a public URL redirects (302) to `/api/api-docs` on the corresponding "Hidden" server.

The APIs seem to be built with Spring Boot (clue: the `Whitelabel Error Page`)
