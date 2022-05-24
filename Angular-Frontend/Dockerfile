FROM node:16.10-alpine AS build
WORKDIR /angular-app
RUN npm install -g @angular/cli
COPY . .
RUN npm install
RUN ng config -g cli.warnings.versionMismatch false && npm run build --prod
WORKDIR /angular-app/dist/return-order-managment-portal
RUN http-server
