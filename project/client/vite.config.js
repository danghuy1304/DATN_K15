import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import path from 'path'


export default defineConfig({
    plugins: [
        vue()
    ],
    resolve: {
        alias: {
            '@': path.resolve(__dirname, 'src') // Tương tự như alias trong vue.config.js
        }
    },
    server: {
        port: 8080,
        host: '0.0.0.0'
    }
})
