# traefik3-demo

| Traefik compress middleware enabled | Spring boot compress enabled | Expected status code | Returned status code | url |
|---|---|---|---|---|
| YES | NO | 400 | 400 | http://demo2.localhost/demo/ko |
| **YES** | **YES** | **400** | **200** | http://demo4.localhost/demo/ko |
| NO | YES | 400 | 400 | http://demo3.localhost/demo/ko |
| NO | NO | 400 | 400 | http://demo1.localhost/demo/ko |