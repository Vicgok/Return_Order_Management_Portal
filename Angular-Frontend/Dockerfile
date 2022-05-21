FROM node:16.10-alpine AS build
WORKDIR /angular-app
RUN npm install -g @angular/cli
COPY . .
RUN npm install
RUN ng config -g cli.warnings.versionMismatch false && npm run build --prod

FROM nginx:1.17.1-alpine
WORKDIR /usr/share/nginx/html
RUN rm -rf ./*
COPY --from=build /angular-app/nginx.conf /etc/nginx/
COPY --from=build /angular-app/dist/return-order-managment-portal /usr/share/nginx/html
ENTRYPOINT ["nginx","-g","daemon off;"]
