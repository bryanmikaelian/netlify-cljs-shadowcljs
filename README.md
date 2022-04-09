# netlify-cljs

[![Deploy to Netlify](https://www.netlify.com/img/deploy/button.svg)](https://app.netlify.com/start/deploy?repository=https://github.com/bryanmikaelian/netlify-cljs)

This a template that lets you deploy a ClojureScript project on Netlify. It is currently using the following:

- [ClojureScript 1.14.x](https://clojurescript.org/)
- [thheller/shadow-cljs](https://github.com/thheller/shadow-cljs)
- [TailwindCSS](https://tailwindcss.com/)
- [PostCSS](https://postcss.org/)
- [Reagent](https://reagent-project.github.io/)

You can find an example of this working at https://cljs-demo.netlify.app

# Commands

When developing locally, these commands can help you out:

### Watch

Watch and recompile your site as you make changes. You can visit your site at http://localhost:8700.

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

# Examples using this template
- https://bob-ross-colors.netlify.app/
