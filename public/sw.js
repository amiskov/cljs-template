const cacheName = 'cache-v1';
const resourcesToPrecache = [
    '/',
    'index.html',
    '/css/main.css',
    '/js/main.js'
];

self.addEventListener('install', event => {
    console.log('Install ServiceWorker.')
    event.waitUntil(
        caches.open(cacheName)
            .then(cache => {
                return cache.addAll(resourcesToPrecache);
            })
    )
});

self.addEventListener('activate', event => {
    console.log('Activate ServiceWorker.')
});

self.addEventListener('fetch', event => {
    console.log('ServiceWorker intercepted fetch for:', event.request.url)
    event.respondWith(
        caches.match(event.request)
            .then(cachedResponse => {
                return cachedResponse || fetch(event.request)
            })
    );
});
