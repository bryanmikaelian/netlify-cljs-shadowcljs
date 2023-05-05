# netlify-cljs-shadowcljs

[![Deploy to Netlify](https://www.netlify.com/img/deploy/button.svg)](https://app.netlify.com/start/deploy?repository=https://github.com/bryanmikaelian/netlify-cljs)

[![Netlify Status](https://api.netlify.com/api/v1/badges/aa02abed-1ee3-4aff-81fd-ab2565b52d1f/deploy-status)](https://app.netlify.com/sites/netlify-cljs-ci/deploys)

This a template that lets you deploy a ClojureScript project on Netlify. It is currently using the following:

- [ClojureScript 1.14.x](https://clojurescript.org/)
- [thheller/shadow-cljs](https://github.com/thheller/shadow-cljs)
- [TailwindCSS](https://tailwindcss.com/)
- [PostCSS](https://postcss.org/)
- [Reagent](https://reagent-project.github.io/)


The template automatically sets up the following features that Netlify Offers:

- A basic Front End deployed as a Netlify Site
- A Netlify Function (see [docs](https://docs.netlify.com/functions/overview/) to learn more)

You can remove some of these features based on your use case.


A demo of this repo is also available at https://cljs-demo.netlify.app

## Interested in using `figwheel-main`?

Checkout https://github.com/bryanmikaelian/netlify-cljs-figwheel

# Commands

When developing locally, these commands can help you out:

### Server

Use the netlify-cli to spin up a dev environment. You can visit your site
at http://localhost:8888. Useful when you want to debug Netlify Functions.

``` shell
yarn server
```

### Watch

Watch and recompile your site as you make changes. You can visit your site at http://localhost:8700. If you use this in tandem with `yarn server`, you can use port 8888 for everything.

``` shell
yarn watch
```

### Clean

Removes artifacts that are generated by shadow-cljs and tailwind

``` shell
yarn clean
```

### Build

Builds the site for release. Netlify will use the same command when deploying

``` shell
yarn release
```

### Server

Runs a shadow-cljs server that hosts your app. Does not watch for changes. You can visit your site at http://localhost:8700.

``` shell
yarn release
```

### REPL

Spins up a shadow-cljs browser REPL

``` shell
yarn repl
```
