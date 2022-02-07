#!/usr/bin/env sh

# Simple script to deploy to GitHub Pages taken from Vuepress.
# Beforehand you need to create an `gh-pages` branch:
#     git checkout --orphan gh-pages
# push it to the `origin`.

# abort on errors
set -e

# build
npm run clean && npm run release
npm run clean && npm run release && npm run twprod

# navigate into the build output directory
cd public

# if you are deploying to a custom domain
# echo 'my-domain.com' > CNAME

git init
git add -A
git commit -m 'deploy'

# if you are deploying to https://<USERNAME>.github.io/<REPO>
git push -f git@github.com:<USERNAME>/<REPO>.git master:gh-pages

cd -