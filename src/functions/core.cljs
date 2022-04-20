(ns functions.core)

(defn handler
  [_event _context callback]
  (callback
    nil
    (clj->js {:statusCode 200 :body "hello world"})))
