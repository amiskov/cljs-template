# Basic ClojureScript App Template
What's inside:

- shadow-cljs
- Reagent
- re-frame + tools for development/debugging
- Tailwind CSS

## Installation
```shell
npm install

# run shadow-cljs
npm run dev

# run tailwind in a separate terminal
npm run twdev
```

## IntelliJ + Cursive
Run `npm run pom` to generate `pom.xml` file for better project indexing.

## Dev Tools
To show re-frame-10x panel press <kbd>Ctrl</kbd>+<kbd>H</kbd>.

## Deploy to GitHub Pages
1. Create `gh-pages` branch in your repo.
2. Replace `<USERNAME>` and `<REPO>` in `deploy.sh`.
3. Run `./deploy.sh`.
